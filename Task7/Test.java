package Task7;
//编写文件分片方法，输入参数：源文件路径sourceFilePath、分片输出目录路径outputDirPath、每个分片最大大小chunkSize(单位：字节)
//将源文件按chunkSize切割为多个子文件，存放到outputDirPath目录下。子文件命名规则为源文件名.partX(X从1开始递增)，如源文件为myWords.txt,分片应为myWords.txt.part1...
//需要使用缓冲区进行读写，注意最后一次读取的字节数
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Test {
    public static void splitFile(String sourceFilePath) throws Exception {
        File sourceFile = new File(sourceFilePath);

        sourceFilePath = "path/to/source/file.txt";
        String outputDirPath = "path/to/output/directory";
        long chunkSize = 1024;
        try{
            splitFile(sourceFilePath, outputDirPath, chunkSize);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
// 分片方法
public static void splitFile(String sourceFilePath, String outputDirPath, long chunkSize) {
    File sourceFile = new File(sourceFilePath);

    if (!sourceFile.exists()) {
        System.out.println("源文件不存在：" + sourceFilePath);
    }
    // 创建输出目录
    File outputDir = new File(outputDirPath);
    if (!outputDir.exists()) {
        outputDir.mkdirs();
    }

    String baseName = sourceFile.getName();
    try (FileInputStream fis = new FileInputStream(sourceFile)) {
        // 使用缓冲区读取（大小为chunkSize）
        byte[] buffer = new byte[(int) chunkSize];
        int partIndex = 1; //分片编号
        int readLen; //本次读取的字节数
        // read() 返回本次实际读取的字节数
        while ((readLen = fis.read(buffer)) != -1) {
            File partFile = new File(outputDir, baseName + ".part" + partIndex);
            try (FileOutputStream fos = new FileOutputStream(partFile)) {
                // 只写出本次实际读取到的字节
                fos.write(buffer, 0, readLen);
            }
            System.out.printf("生成分片：%s，大小：%d字节%n", partFile.getName(), readLen);
            partIndex++;
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}

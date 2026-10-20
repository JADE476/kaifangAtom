package Task4_3;
/*题干：在大型物流中，仓库的“通用储物箱”既可以用来装商品，也可以用来装小型的无人机设备。如果不使用泛型，取出物品时需要频繁进行不安全的强制类型转换。请你编写一个类型安全的泛型储物箱。
要求：
Task1: 定义一个泛型类 StorageBox<T>，包含一个泛型属性 private T item。
Task2: 为该类提供 public void storeItem(T item) 方法用于存入物品，
       以及 public T retrieveItem() 方法用于取出物品。
Task3: 在 main 方法中，分别实例化一个专门存储商品的储物箱 StorageBox<Product>，
       和一个专门存储运输工具的储物箱 StorageBox<TransportVehicle>。
Task4: 分别存入前两个任务中创建的商品和无人机对象，再将它们安全地取出并打印其特征信息。
       体会泛型如何消灭向下转型（Downcasting）的安全隐患。
考察能力： 泛型类 <T> 的定义与声明、泛型作为方法参数与返回值的运用、
以及利用泛型在编译阶段进行类型安全检查的架构思维🛡。
示例输出：
商品储物箱存取测试：成功取出商品 -> 机械键盘
设备储物箱存取测试：成功取出设备 -> 无人机 [D-007]*/

import Task4.Product;
import Task4_2.TransportVehicle;
import Task4_2.Drone;

public class Test {
    public static void main(String[] args) {
        // 创建商品和运输工具对象
        Product keyBoard = new Product("机械键盘", "电子产品", 299.99);
        TransportVehicle drone = new Drone("D-007", "无人机");
        //实例化存储商品和运输工具的工具箱
        StorageBox<Product> productBox = new StorageBox<>();
        StorageBox<TransportVehicle> vehicleBox = new StorageBox<>();
        //存入
        productBox.storeItem(keyBoard);
        vehicleBox.storeItem(drone);

        //取出
        Product retrievedProduct = productBox.retrieveItem();
        System.out.println("商品储物箱存取测试：成功取出商品 -> " + retrievedProduct.getName());
        TransportVehicle retrievedVehicle = vehicleBox.retrieveItem();
        System.out.println("设备储物箱存取测试：成功取出设备 -> " + retrievedVehicle.getName() + " [" + retrievedVehicle.getVehicleId() + "]");
    }

    //若不用泛型而用Object存储，取出是必须进行强制类型转换，如果产生错误，编译期间
    //无法发现
}

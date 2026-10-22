package Task4_4;


    public class MyArrayList<T> {

        // Task1
        private Object[] elements;
        private int size;

        public MyArrayList() {
            this.elements = new Object[3];
            this.size = 0;
        }

        //Task2: 添加与扩容
        public void add(T element) {
            // 检查是否已满
            if (size == elements.length) {   // 如果满了
                int oldCapacity = elements.length;
                int newCapacity = oldCapacity * 2;
                Object[] newArray = new Object[newCapacity];
                // 复制
                for (int i = 0; i < oldCapacity; i++) {
                    newArray[i] = elements[i];
                }
                // elements 引用指向新数组
                elements = newArray;
                System.out.println("触发底层扩容！当前数组容量由 " + oldCapacity + " 扩容至 " + newCapacity);
            }
            // 存入新元素并 size++
            elements[size] = element;
            size++;
            System.out.println("成功添加：" + element);
        }

        //Task3: 查询

        public T get(int index) {
            // 边界安全检查
            if (index < 0 || index >= size) {
                System.out.println("索引越界: " + index + "，当前有效范围 [0, " + (size - 1) + "]");
                return null;
            }
            // 向下转型
            return (T) elements[index];
        }

        // Task4: 删除
        public void remove(int index) {
            // 边界检查
            if (index < 0 || index >= size) {
                System.out.println("索引越界: " + index + "，无法删除");
                return;
            }
            // 记录被删除元素用于打印
            Object removed = elements[index];
            // 移位：index 之后的元素依次前移一位
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            // 最末尾多余位置置 null
            elements[size - 1] = null;
            size--;
            System.out.println("删除了索引[" + index + "]的元素(" + removed + ")");
        }

        // Task5: 实战测试
        public static void main(String[] args) {
            MyArrayList<String> list = new MyArrayList<>();

            // 连续存入 5 个包裹单号
            list.add("单号A");
            list.add("单号B");
            list.add("单号C");
            list.add("单号D");
            list.add("单号E");

            // 打印获取索引为 2 的单号
            System.out.println("获取索引[2]的元素：" + list.get(2));

            // 删除索引为 1 的单号
            list.remove(1);

            // 再次打印索引为 1 的单号，验证数据是否成功前移
            System.out.println("验证移位，此时索引[1]的元素变为了：" + list.get(1));
        }
    }


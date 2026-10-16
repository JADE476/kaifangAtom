package Task4;

public class test {
    public static void main(String[] args) {
        Product p1 = new Product("P001","机械键盘",100);
        Product p2 = new Product("P002","无线鼠标",50);
        p1.printmethod();
        p2.printmethod();

        System.out.println("总商品数量为：" + Product.getTotalCount());

    }
}

package Task4;

public class Product {
    private String name;
    private String category;
    private double price;

    private static int totalProductCount = 0;

    public Product(){
        totalProductCount++;
    }
    public Product(String name, String category, double price){
        this.name = name;
        this.category = category;
        this.price = price;
        totalProductCount++;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public static int getTotalCount(){
        return totalProductCount;
    }
    public void printmethod(){
        System.out.println("商品信息：["+getName()+","+getCategory()+","+getPrice()+"]");
    }

}

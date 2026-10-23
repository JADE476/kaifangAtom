package Task6;

import java.util.ArrayList;

public class Order {
    //创建实体类Order，包含属性为订单号,客户姓名,订单金额,商品标签(属性为List<String>)

    private String orderNumber;
    private String customerName;
    private double orderAmount;
    private ArrayList<String> productLabels;

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderAmount=" + orderAmount +
                ", productLabels=" + productLabels +
                '}';
    }

    public Order(String orderNumber, String customerName, double orderAmount, ArrayList<String> productLabels) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.productLabels = productLabels;
    }

    public String getOrderNumber() {
        return orderNumber;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double getOrderAmount() {
        return orderAmount;
    }
    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }
    public ArrayList<String> getProductLabels() {
        return productLabels;
    }
    public void setProductLabels(ArrayList<String> productLabels) {
        this.productLabels = productLabels;
    }

    //实现排序规则：默认按订单金额降序排列，如果金额相同按订单号升序排列
    public int compareTo(Order o) {
        if (Double.compare(o.orderAmount, this.orderAmount) != 0) {
            return Double.compare(o.orderAmount, this.orderAmount);
        }
        return this.orderNumber.compareTo(o.orderNumber);
    }
}

package Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderAnalyzer {
    private final List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    //删除金额小于0的无效订单
    public void removeInvalidOrders() {
        orderList.removeIf(order -> order.getOrderAmount() < 0);
    }

    //获取所有不重复标签
    public Set<String> getAllUniqueTags(){
        return orderList.stream()
                .flatMap(order -> order.getProductLabels().stream())
                .collect(Collectors.toSet());
    }
    //分组
    public Map<String,Double> getCustomerSpendMap(){
        return orderList.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.summingDouble(Order::getOrderAmount)
                ));
    }

    //返回，按客户姓名字母升序
    public List<Order> sortOrderByCustomerName(){
        return orderList.stream()
                .sorted((o1, o2) -> o1.getCustomerName().compareTo(o2.getCustomerName()))
                .collect(Collectors.toList());
    }

    public List<Order> getOrderList(){
        return new ArrayList<>(orderList);
    }
}

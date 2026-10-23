package Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/*   订单1："O001", "Alice", 150.0, ["电子", "数码"]
  · 订单2："O002", "Bob", -50.0, ["服装"]
  · 订单3："O003", "Alice", 200.0, ["图书", "电子"]
  · 订单4："O004", "Charlie", 200.0, ["生鲜"]
  · 订单5："O005", "Bob", 300.0, ["服装", "户外"]*/

public class Test {
    public static void main(String[] args) {
        OrderAnalyzer analyzer = new OrderAnalyzer();

        analyzer.addOrder(new Order("001", "Alice", 150.0, new ArrayList<>(List.of("电子","数码"))));
        analyzer.addOrder(new Order("002", "Bob", -50.0, new ArrayList<>(List.of("服装"))));
        analyzer.addOrder(new Order("003", "Charlie", 200.0, new ArrayList<>(List.of("图书", "电子"))));
        analyzer.addOrder(new Order("004", "David", 100.0, new ArrayList<>(List.of("生鲜"))));
        analyzer.addOrder(new Order("005", "Bob", 300.0, new ArrayList<>(List.of("服装", "户外"))));


        System.out.println("打印原始订单：");
        System.out.println(analyzer.getOrderList());

        // 打印过滤后订单
        System.out.println("打印过滤后订单：");
        analyzer.removeInvalidOrders();
        System.out.println(analyzer.getOrderList());

        // 打印所有唯一标签
        System.out.println("打印所有唯一标签：");
        System.out.println(analyzer.getAllUniqueTags());
        // 打印客户消费金额
        System.out.println("打印客户消费金额：");
        System.out.println(analyzer.getCustomerSpendMap());
        // 打印按客户名称排序的订单
        System.out.println("打印按客户名称排序的订单：");
        System.out.println(analyzer.sortOrderByCustomerName());
    }
}

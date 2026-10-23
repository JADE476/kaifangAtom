package Task5;

public class PaymentProcessor {
    /*  创建支付类PaymentProcessor,包含一个支付方法，接收参数为金额和流水号
  · 如果金额<0,该方法抛出java原生的IllegalArgumentException,提示“支付金额不能为负数”
  · 如果金额>10000,抛出自定义的InsufficientFundsException,提示“余额不足”，并传入参数中的流水号
  · 如果金额=500，抛出自定义的SystemMaintenanceException,提示“网络连接超时”，并将一个NullPointerException原始异常附带进去
  · 其他情况则打印“交易[流水号]支付成功，金额：[金额]”*/

    public void pay(String transactionID, double amount) throws InsufficientFundsException, SystemMaintenanceException {
        if(amount < 0){
            throw new IllegalArgumentException("支付金额不能为负");
        }
        if(amount > 10000){
            throw new SystemMaintenanceException("余额不足", new Exception(transactionID));
        }
        if(amount == 500){
            throw new SystemMaintenanceException("网络连接超时", new NullPointerException());
        }
        System.out.println("交易"+transactionID+"支付成功，金额："+amount);
    }
}

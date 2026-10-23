package Task5;
/*  创建服务类，包含一个方法，该方法中需实例化支付类并进行异常捕获：
  · 捕获受检异常，打印“余额不足，流水号为[流水号]”，并返回false
  · 捕获IllegalArgumentException，需将其包装SystemMaintenanceException重新抛出
  · 捕获其他异常，打印“发生未知异常:[异常信息]”，并返回false
      · 无论支付是否成功，最后都需要打印“执行资源清理任务...”
  · 没有异常，返回true*/



public class Survice {
    public boolean doSurvice(double amount, String transactionID) throws InsufficientFundsException {
        PaymentProcessor paymentProcessor = new PaymentProcessor();


        try {
            paymentProcessor.pay(transactionID, amount);
        } catch (InsufficientFundsException e) {
            System.out.println("余额不足，流水号为" + transactionID);
            return false;
        } catch (IllegalArgumentException e) {
            throw new SystemMaintenanceException("支付金额不能为负", e);
        } catch (Exception e) {
            System.out.println("发生未知异常:" + e.getMessage());
            return false;
        } finally {
            System.out.println("执行资源清理任务...");
        }
        return true;
    }
}
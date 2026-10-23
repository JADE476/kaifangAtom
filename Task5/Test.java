package Task5;

public class Test {
    public static void main(String[] args) throws InsufficientFundsException {
        Survice survice = new Survice();

        survice.doSurvice(-10, "SN001");
        survice.doSurvice(20000, "SN002");
        survice.doSurvice(500, "SN003");

    }

    private static void testCase(Survice survice, double anount, String tansactionID) {
        System.out.println("Testing with amount " + anount + " and transaction ID " + tansactionID);

        try {
            boolean result = survice.doSurvice(anount, tansactionID);
            System.out.println("业务返回结果：" + result);
        }catch(SystemMaintenanceException e){
            System.out.println("系统维护异常：" + e.getMessage());
        } catch (InsufficientFundsException e) {
            throw new RuntimeException(e);
        }
    }
}

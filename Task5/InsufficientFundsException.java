package Task5;

public class InsufficientFundsException extends Exception{

    private String transactionID;

    public InsufficientFundsException(String transactionID, String message) {
        this.transactionID = transactionID;
        super(message);
    }

    public String getTransactionID() {
        return transactionID;
    }
}

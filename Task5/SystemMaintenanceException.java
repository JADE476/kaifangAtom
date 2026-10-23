package Task5;

public class SystemMaintenanceException extends RuntimeException {
    public SystemMaintenanceException(String message, Throwable cause) {
        super(message, cause);

    }
    @Override
    public String getMessage() {
        return "System is under maintenance. Please try again later. " + super.getMessage();
    }
}

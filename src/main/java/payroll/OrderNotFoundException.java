package payroll;

public class OrderNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public OrderNotFoundException(long id) {
        super("Could not find order"+id);
    }
    
}

package payroll;

public class EmployeeNotFoundException extends RuntimeException{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public EmployeeNotFoundException(long id) {
        super("Could not find employee"+id);
    }
    
}

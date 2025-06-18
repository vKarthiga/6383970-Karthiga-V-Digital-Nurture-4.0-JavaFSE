package di;

public class Main {
    public static void main(String[] args) {
        // Create the repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find and display customer details
        System.out.println("Finding customer with ID C102:");
        customerService.displayCustomerDetails("C102");

        System.out.println("\nFinding customer with ID C101:");
        customerService.displayCustomerDetails("C101");

        System.out.println("\nFinding customer with ID C999:");
        customerService.displayCustomerDetails("C999");
    }
}

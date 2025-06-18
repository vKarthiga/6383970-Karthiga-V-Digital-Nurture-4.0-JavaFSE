package di;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor-based Dependency Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomerDetails(String customerId) {
        Customer customer = customerRepository.findCustomerById(customerId);
        if (customer != null) {
            System.out.println("Customer Details: " + customer);
        } else {
            System.out.println("Customer not found with ID: " + customerId);
        }
    }
}

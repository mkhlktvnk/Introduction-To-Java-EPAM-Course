import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerService {
    private final List<Customer> customers = new ArrayList<>();

    public void addNewCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    public List<Customer> findCustomersWithCreditCardNumberInInterval(long lowValue, long highValue) {
        return customers.stream().filter((customer ->
                customer.getCreditCardNumber() >= lowValue && customer.getCreditCardNumber() <= highValue)).toList();
    }

    public void sortCustomersAlphabetically() {
        Collections.sort(customers);
    }
}

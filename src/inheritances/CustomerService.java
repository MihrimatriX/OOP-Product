package inheritances;

public class CustomerService {
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " eklendi.");
    }

    //Bulk Insert
    public void addMultiple(Customer[] customers) {
        for (Customer customer : customers) {
            add(customer);
        }
    }

}

package inter;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new FileLogger(), new SmsLogger(), new EmailLogger(), new DatabaseLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer customer = new Customer(1, " engin", "soba" );
        customerManager.add(customer);

    }
}

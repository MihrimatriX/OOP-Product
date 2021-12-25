package inform;

public class Information {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new FileLogger());
    }
}

package inheritances;

public class Inheritance {
    public static void main(String[] args) {

        IndividualCustomer afu = new IndividualCustomer();
        afu.customerNumber = "123123";

        CorporateCustomer hepsiburada = new CorporateCustomer();
        hepsiburada.customerNumber = "hepsiburada";

        UnionCostomer unionCostomer = new UnionCostomer();
        unionCostomer.customerNumber = "AAFFUU";

        CustomerService customerService = new CustomerService();

        Customer[] customers = {afu, hepsiburada, unionCostomer};
        customerService.addMultiple(customers);




    }
}

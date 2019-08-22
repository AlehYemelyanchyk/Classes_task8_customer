public class BankBranch {

    private Customer[] customers;

    public BankBranch() {
        this.customers = new Customer[3];
    }

    public void addCustomers() {
        Customer customer1 = new Customer("Madison", "Bob", "Troh", "Wall str, 7-40",
                2348, 1232343224127428L);
        Customer customer2 = new Customer("Wilson", "Alan", "Muh", "Wall str, 3-21",
                5846, 1856248653187658L);
        Customer customer3 = new Customer("Gambgi", "Saluman", "Zumba", "Wall str, 5-10",
                4586, 1354684589654843L);

        customers[0] = customer1;
        customers[1] = customer2;
        customers[2] = customer3;
    }

    public void printCustomer(int id) {
        System.out.println("Customer " +(id+1));
        System.out.println(customers[id].toString());
    }

    public void printCustomersByCardRange(long from, long to) {
        for (Customer customer : customers) {
            if (customer.getCardNumber() >= from && customer.getCardNumber() <= to) {
                System.out.println(customer.toString());
            }
        }
    }

    public void printCustomersAlphabetically() {
        Customer[] customersSortedAlphabet = sortCustomersAlphabetically(customers);
        for (Customer customer : customersSortedAlphabet) {
            System.out.println(customer.toString());
        }
    }

    private Customer[] sortCustomersAlphabetically(Customer[] customers) {
        Customer[] customersSortedAlphabet = customers;


        boolean quit = false;

        while (!quit) {

            quit = true;

            for (int i = 1; i < customers.length; i++) {
                if (customersSortedAlphabet[i].getSurname().compareTo(customersSortedAlphabet[i - 1].getSurname()) < 0) {
                    Customer temp = customersSortedAlphabet[i];
                    customersSortedAlphabet[i] = customers[i - 1];
                    customersSortedAlphabet[i - 1] = temp;
                    quit = false;
                }
            }
        }
        return customersSortedAlphabet;
    }
}

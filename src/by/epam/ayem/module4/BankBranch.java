package by.epam.ayem.module4;

/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карты, номер банковского счета.
    Найти и вывести:
    а) список покупателей в алфавитном порядке;
    б) список покупателей, у которых номер кредитной карты находится в заданном интервале.*/

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

        sortCustomersAlphabetically();
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    private void sortCustomersAlphabetically() {

        boolean quit = false;

        while (!quit) {

            quit = true;

            for (int i = 1; i < customers.length; i++) {
                if (customers[i].getSurname().compareTo(customers[i - 1].getSurname()) < 0) {
                    Customer temp = customers[i];
                    customers[i] = customers[i - 1];
                    customers[i - 1] = temp;
                    quit = false;
                }
            }
        }
    }
}

/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карты, номер банковского счета.
    Найти и вывести:
    а) список покупателей в алфавитном порядке;
    б) список покупателей, у которых номер кредитной карты находится в заданном интервале.*/

public class CustomerMain {

    public static void main(String[] args) {

        BankBranch customers = new BankBranch();
        customers.addCustomers();
        customers.addCustomers();
        customers.printCustomer(0);
        customers.printCustomersAlphabetically();
        customers.printCustomersByCardRange(2000,5000);
    }
}

package by.epam.ayem.module4;

/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карты, номер банковского счета.
    Найти и вывести:
    а) список покупателей в алфавитном порядке;
    б) список покупателей, у которых номер кредитной карты находится в заданном интервале.*/

public class AppRunner {

    public static void main(String[] args) {

        BankBranch customers = new BankBranch();
        customers.addCustomers();
        customers.addCustomers();
        System.out.println("Customers in the alphabetical order:");
        customers.printCustomersAlphabetically();
        System.out.println("=====================================");
        System.out.println("Customers have cards in the range:");
        customers.printCustomersByCardRange(2000,5000);
    }
}

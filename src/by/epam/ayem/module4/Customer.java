package by.epam.ayem.module4;

/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карты, номер банковского счета.
    Найти и вывести:
    а) список покупателей в алфавитном порядке;
    б) список покупателей, у которых номер кредитной карты находится в заданном интервале.*/

public class Customer {

    private int id;
    private static int commonId;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long cardNumber;
    private long accountNumber;

    public Customer(String surname, String name, String patronymic, String address, long cardNumber, long accountNumber) {
        id = commonId++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.accountNumber = accountNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "surname: " + surname +
                "\nid: " + id +
                "\nname: " + name +
                "\npatronymic: " + patronymic +
                "\naddress: " + address +
                "\ncard number: " + cardNumber +
                "\naccount number: " + accountNumber + "\n";
    }
}

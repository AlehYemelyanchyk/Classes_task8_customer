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

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
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

public class Customer implements Comparable<Customer> {
    private long id;
    private String name;
    private String surname;
    private String patronymic;
    private long creditCardNumber;
    private long bankAccountNumber;

    public Customer(long id, String name, String surname, String patronymic, long creditCardNumber, long bankAccountNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        int compareNamesResult = this.name.compareTo(o.name);
        if (compareNamesResult == 0) {
            int compareSurnamesResult = this.surname.compareTo(o.surname);
            if (compareSurnamesResult == 0) {
                return this.patronymic.compareTo(o.patronymic);
            }
            return compareSurnamesResult;
        }
        return compareNamesResult;
    }
}

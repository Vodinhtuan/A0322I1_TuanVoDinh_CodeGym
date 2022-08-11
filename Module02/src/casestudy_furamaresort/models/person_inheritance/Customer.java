package casestudy_furamaresort.models.person_inheritance;

public class Customer extends Person {
    private String customerType, address;

    public Customer() {
    }

    public Customer(int id, String name, String birthDay, String sex, int idCard, int phoneNumber, String email, String customerType, String address) {
        super(id, name, birthDay, sex, idCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer " + super.toString() +
                " customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

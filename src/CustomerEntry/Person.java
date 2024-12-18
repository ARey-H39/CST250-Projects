package src.CustomerEntry;

public class Person {
    // Set private fields
    private String name;
    private String address;
    private String phoneNumber;

    // Constructor 1: Only name input
    public Person(String name) {
        this.name = name;
    }

    // Constructor 2: Accepts name and address
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Constructor 3: Accepts name, address, and phone number
    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Access and modify name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Access and modify address
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // Access and modify phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

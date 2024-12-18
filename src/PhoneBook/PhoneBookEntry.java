package src.PhoneBook;

public class PhoneBookEntry {
    private String name;
    private String phoneNumber;

    // Constructor
    public PhoneBookEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Returns the object's name
    public String getName() {
        return this.name;
    }

    // Returns the object's phone number
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // Change the object's name
    public void setName(String name) {
        this.name = name;
    }

    // Change the object's phone number
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nPhone Number: " + this.phoneNumber + "\n";
    }
}

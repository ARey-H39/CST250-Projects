package src.CustomerEntry;

public class Customer extends Person {
    // Private fields
    private int customerNumber;
    private boolean mailingList;

    // Constructor
    public Customer(String name, String address, String phoneNumber, int number, boolean mailing) {
        super(name, address, phoneNumber);
        customerNumber = number;
        mailingList = mailing;
    }

    // Access and modify customer number
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int number) {
        customerNumber = number;
    }

    // Access and modify mailingList
    public boolean getMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    // Output object as string
    public String toString() {
        return "Customer Number " + customerNumber
                + "\nName: " + getName()
                + "\nAddress: " + getAddress()
                + "\nPhone Number: " + getPhoneNumber()
                + "\nIs on Mailing List?: " + mailingList;
    }
}

package src.PhoneBook;

import java.util.ArrayList;

public class PhoneBook {

    public static void main(String[] args) {
        // Create an ArrayList that will store PhoneBookEntry
        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<>();

        // Create 5 objects of PhoneBookEntry
        PhoneBookEntry entry1 = new PhoneBookEntry("John", "(852)714-7075");
        PhoneBookEntry entry2 = new PhoneBookEntry("Bob", "(470)839-4491");
        PhoneBookEntry entry3 = new PhoneBookEntry("Carlos", "(760)778-6765");
        PhoneBookEntry entry4 = new PhoneBookEntry("Smith", "(307)870-2822");
        PhoneBookEntry entry5 = new PhoneBookEntry("James", "(540)630-3786");

        // Add all 5 entries to the PhoneBook ArrayList
        phoneBook.add(entry1);
        phoneBook.add(entry2);
        phoneBook.add(entry3);
        phoneBook.add(entry4);
        phoneBook.add(entry5);

        // Loop through each element of phoneBook
        for (int i = 0; i < phoneBook.size(); i++) {
            // Print each phone book entry
            System.out.println(phoneBook.get(i));
        }
    }
}

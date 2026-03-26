

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String firstName;
    String lastName;
    String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return firstName + " " + lastName + " - " + phoneNumber;
    }
}

public class ContactBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(contact);
        System.out.println("Contact Added Successfully!");
    }

    public void removeContact() {
        System.out.print("Enter phone number to delete: ");
        String phoneNumber = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.phoneNumber.equals(phoneNumber)) {
                contacts.remove(contact);
                System.out.println("Contact removed successfully!");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public void findContactByPhoneNumber() {
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        for (Contact contact : contacts) {
            if (contact.phoneNumber.equals(phoneNumber)) {
                System.out.println(contact);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    
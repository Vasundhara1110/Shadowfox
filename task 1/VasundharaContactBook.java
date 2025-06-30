import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Email : " + email);
        System.out.println("----------------------");
    }
}

public class VasundharaContactBook {

    static ArrayList<Contact> contactList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n Welcome to Vasundhara Contact Book");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {
                case 1: addContact(); break;
                case 2: viewContacts(); break;
                case 3: updateContact(); break;
                case 4: deleteContact(); break;
                case 0: System.out.println("Thanks for using Vasundhara Contact Manager"); break;
                default: System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }

    static void addContact() {
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        System.out.print("Enter Phone: ");
        String phone = input.nextLine();
        System.out.print("Enter Email: ");
        String email = input.nextLine();

        contactList.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully!");
    }

    static void viewContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        for (Contact c : contactList) {
            c.display();
        }
    }

    static void updateContact() {
        System.out.print("Enter name to update: ");
        String name = input.nextLine();

        for (Contact c : contactList) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.print("New Phone: ");
                c.phone = input.nextLine();
                System.out.print("New Email: ");
                c.email = input.nextLine();
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = input.nextLine();

        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).name.equalsIgnoreCase(name)) {
                contactList.remove(i);
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}

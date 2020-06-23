package contactsManager;

import utils.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactApplication {
    public static Input input = new Input();

    public static void main(String[] args) throws IOException {
        boolean keepLooking = true;

        do {
            Path contacts = Paths.get("src/contactsManager", "contacts.txt");
            List<String> contactList = Files.readAllLines(contacts);

            System.out.println("\n------------------ MENU -----------------------");
            System.out.println("1. View contacts." +
                    "\n2. Add a new contact." +
                    "\n3. Search a contact by name." +
                    "\n4. Delete an existing contact." +
                    "\n5. Exit." +
                    "\nEnter an option (1, 2, 3, 4, 5):");
            System.out.println("-----------------------------------------------");

            int userChoice = input.getInt(1, 5);

            switch (userChoice) {
                case 1:
                    //VIEW CONTACTS
                    System.out.println("=============== ALL CONTACTS ==================");

                    String[] allContactsArray;
                    for (String contact : contactList) {

                        allContactsArray = contact.split(",");
                        System.out.println(allContactsArray[0] + allContactsArray[1] + " :" + allContactsArray[2]);

                    }
                    keepLooking = true;
                    break;
                case 2:
                    //ADD CONTACT
                    System.out.println("Enter contact first name: ");
                    String userInputFirstName = input.getString();
                    System.out.println("Enter contact last name: ");
                    String userInputLastName = input.getString();
                    System.out.println("Enter contact phone number: ");
                    String userInputDigits = input.getString();
                    Files.write(contacts, Arrays.asList(userInputFirstName + ", " + userInputLastName + ", " + userInputDigits), StandardOpenOption.APPEND);
                    keepLooking = true;
                    break;
                case 3:
                    //SEARCH BY NAME
                    System.out.println("Enter contact first name: ");
                    String userSearchContactName = input.getString();
                    String[] searchArray;
                    for (String contact : contactList) {
                        searchArray = contact.split(",");

                        for (int i = 0; i < searchArray.length - 1; i++)
                            if (searchArray[i].contains(userSearchContactName)) {
                                System.out.println("-------");
                                System.out.println(searchArray[0] + searchArray[1] + searchArray[2]);
                                System.out.println("-------");
                            }
                    }

                    keepLooking = true;
                    break;
                case 4:
                    //DELETE CONTACT
                    System.out.println("Enter contact First name: ");
                    String userDeleteContactName = input.getString();

                    String[] deleteArray;
                    String contactToBeDeleted = "";

                    for (String contact : contactList) {
                        deleteArray = contact.split(",");

                        List<String> deleteContact = Arrays.asList(deleteArray);

                        if (deleteContact.contains(userDeleteContactName)) {
                            contactToBeDeleted = contact;
                        }
                    }
                    contactList.remove(contactToBeDeleted);
                    Files.write(contacts, contactList);

                    keepLooking = true;
                    break;
                case 5:
                    //EXIT
                    System.out.println("While contacts may be great glasses are better. Bye!");
                    keepLooking = false;
                    break;
                default:
                    System.out.println("Invalid input.");

            }


        } while (keepLooking);


    }
}

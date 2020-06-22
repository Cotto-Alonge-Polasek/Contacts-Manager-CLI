package contactsManager;

import utils.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ContactApplication {
   public static Input input = new Input();



    public static void main(String[] args ) throws IOException {
     boolean keepLooking = true;

     do {
         Path contacts = Paths.get("src/contactsManager","contacts.txt");
         List<String> contactList = Files.readAllLines(contacts);
         System.out.println("\n1. View contacts." +
                 "\n2. Add a new contact." +
                 "\n3. Search a contact by name." +
                 "\n4. Delete an existing contact." +
                 "\n5. Exit." +
                 "\nEnter an option (1, 2, 3, 4, 5):");

         int userChoice = input.getInt(1, 5);

         switch (userChoice){
             case 1:
                 for (String contact : contactList){
                     System.out.println(contact);
                 }
                 keepLooking = true;
                 break;
             case 2:

                 keepLooking = true;
                 break;
             case 3:

                 keepLooking = true;
                 break;
             case 4:

                 keepLooking = true;
                 break;
             case 5:

                 keepLooking = false;
                 break;
             default:
                 System.out.println("Invalid input.");

         }


     } while(keepLooking);


    }
}

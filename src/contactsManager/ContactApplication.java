package contactsManager;

import java.io.IOException;

public class ContactApplication {

    public static void main(String[] args) throws IOException {

        //CONTACTS OBJECT
        Contacts contactsApp = new Contacts();

        boolean keepLooking = true;
        do {
            contactsApp.path();
            contactsApp.readFile();
            contactsApp.menu();

            switch (contactsApp.getInt(1, 5)) {
                case 1:
                    //VIEW CONTACTS
                    contactsApp.caseOne(contactsApp.readFile());
                    keepLooking = true;
                    break;
                case 2:
                    //ADD CONTACT
                    contactsApp.caseTwo(contactsApp.path());
                    keepLooking = true;
                    break;
                case 3:
                    //SEARCH BY NAME
                    contactsApp.caseThree(contactsApp.readFile());
                    keepLooking = true;
                    break;
                case 4:
                    //DELETE CONTACT
                    contactsApp.caseFour(contactsApp.path(), contactsApp.readFile());
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

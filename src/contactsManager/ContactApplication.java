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

            System.out.println("\n------------------ MENU ---------------------");
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
                    System.out.println("============ ALL CONTACTS ===============|");
                    System.out.println("Name                   | Phone Number    |");
                    System.out.println("-----------------------------------------|");

                    String[] allContactsArray;
                    for (String contact : contactList) {

                        allContactsArray = contact.split(",");

                        System.out.printf("%-10s%-13s|%5s%7s\n" , allContactsArray[0],allContactsArray[1], allContactsArray[2],"|");
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
                    System.out.println("Enter contact's name: ");
                    String userSearchContactName = input.getString();
                    String[] searchArray;
                    for (String contact : contactList) {
                        searchArray = contact.split(",");

                        for (int i = 0; i < searchArray.length - 1; i++) {
                            if (searchArray[i].contains(userSearchContactName)) {
                                System.out.println("-------");
                                System.out.println(searchArray[0] + searchArray[1] + ": " + searchArray[2]);
                                System.out.println("-------");
                            }
                        }
                    }
                    if (userSearchContactName.equalsIgnoreCase("Joe")){
                        System.out.println("                       __,,,,_\n" +
                                "          _ __..-;''`--/'/ /.',-`-.\n" +
                                "      (`/' ` |  \\ \\ \\\\ / / / / .-'/`,_\n" +
                                "     /'`\\ \\   |  \\ | \\| // // / -.,/_,'-,\n" +
                                "    /<7' ;  \\ \\  | ; ||/ /| | \\/    |`-/,/-.,_,/')\n" +
                                "   /  _.-, `,-\\,__|  _-| / \\ \\/|_/  |    '-/.;.\\'\n" +
                                "   `-`  f/ ;      / __/ \\__ `/ |__/ |\n" +
                                "        `-'      |  -| =|\\_  \\  |-' |\n" +
                                "              __/   /_..-' `  ),'  //\n" +
                                "             ((__.-'((___..-'' \\__.'\n");
                    }else if (userSearchContactName.equalsIgnoreCase("Knoah")){
                        System.out.println("     z$$$$$. $$\n" +
                                "    $$$$$$$$$$$\n" +
                                "   $$$$$$**$$$$             eeeeer\n" +
                                "  $$$$$%   '$$$             $$$$$F\n" +
                                " 4$$$$P     *$$             *$$$$F\n" +
                                " $$$$$      '$$    .ee.      ^$$$F            ..e.\n" +
                                " $$$$$       \"\"  .$$$$$$b     $$$F 4$$$$$$   $$$$$$c\n" +
                                "4$$$$F          4$$$\"\"$$$$    $$$F '*$$$$*  $$$P\"$$$L\n" +
                                "4$$$$F         .$$$F  ^$$$b   $$$F  J$$$   $$$$  ^$$$.\n" +
                                "4$$$$F         d$$$    $$$$   $$$F J$$P   .$$$F   $$$$\n" +
                                "4$$$$F         $$$$    3$$$F  $$$FJ$$P    4$$$\"   $$$$\n" +
                                "4$$$$F        4$$$$    4$$$$  $$$$$$$r    $$$$$$$$$$$$\n" +
                                "4$$$$$        4$$$$    4$$$$  $$$$$$$$    $$$$********\n" +
                                " $$$$$        4$$$$    4$$$F  $$$F4$$$b   *$$$r\n" +
                                " 3$$$$F       d$$$$    $$$$\"  $$$F *$$$F  4$$$L     .\n" +
                                "  $$$$$.     d$$$$$.   $$$$   $$$F  $$$$.  $$$$    z$P\n" +
                                "   $$$$$e..d$$$\"$$$b  4$$$\"  J$$$L  '$$$$  '$$$b..d$$\n" +
                                "    *$$$$$$$$$  ^$$$be$$$\"  $$$$$$$  3$$$$F \"$$$$$$$\"\n" +
                                "     ^*$$$$P\"     *$$$$*    $$$$$$$   $$$$F  ^*$$$\"      zero");


                    }else if(userSearchContactName.equalsIgnoreCase("Mark")){
                        System.out.println("Ⓘ️ⓜ  Ⓑⓐⓣⓜⓐⓝ");
                        System.out.println("       _,    _   _    ,_\n" +
                                "  .o888P     Y8o8Y     Y888o.\n" +
                                " d88888      88888      88888b\n" +
                                "d888888b_  _d88888b_  _d888888b\n" +
                                "8888888888888888888888888888888\n" +
                                "8888888888888888888888888888888\n" +
                                "YJGS8P\"Y888P\"Y888P\"Y888P\"Y8888P\n" +
                                " Y888   '8'   Y8P   '8'   888Y\n" +
                                "  '8o          V          o8'");
                    }else if(userSearchContactName.equalsIgnoreCase("shelby")){
                        System.out.println("        ______\n" +
                                "       /     /\\\n" +
                                "      /     /  \\\n" +
                                "     /_____/----\\_    (  \n" +
                                "    \"     \"          ).  \n" +
                                "   _ ___          o (:') o   \n" +
                                "  (@))_))        o ~/~~\\~ o   \n" +
                                "                  o  o  o");
                    }else if(userSearchContactName.equalsIgnoreCase("Howard")){
                        System.out.println("Sorry this number is no longer available. Cat got his tongue, and his arms, and his legs...");
                        System.out.println("                                          \n" +
                                "                                             ,YWMMw  ,M  ,\n" +
                                "                        _.---.._   __..---._.'MMMMMw,wMWmW,\n" +
                                "                   _.-\"\"        \"\"\"           YP\"WMMMMMMMMMb,\n" +
                                "                .-' __.'                   .'     MMMMW^WMMMM;\n" +
                                "    _,        .'.-'\"; `,       /`     .--\"\"      :MMM[==MWMW^;\n" +
                                " ,mM^\"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW\"  @\\\n" +
                                ",MM:.    .'.-'   .'     ;     `\\    ;     `,     MMMMMMMW `\"=./`-,\n" +
                                "WMMm__,-'.'     /      _.\\      F\"\"\"-+,,   ;_,_.dMMMMMMMM[,_ / `=_}\n" +
                                "\"^MP__.-'    ,-' _.--\"\"   `-,   ;       \\  ; ;MMMMMMMMMMW^``; __|\n" +
                                "           /   .'            ; ;         )  )`{  \\ `\"^W^`,   \\  :\n" +
                                "          /  .'             /  (       .'  /     Ww._     `.  `\"\n" +
                                "         /  Y,              `,  `-,=,_{   ;      MMMP`\"\"-,  `-._.-,\n" +
                                "        (--, )                `,_ / `) \\/\"\")      ^\"      `-, -;\"\\:\n" +
                                "         `\"\"\"                    `\"\"\"   `\"'                  `---\"");
                        System.out.println(" _       _\n" +
                                "(_'-----'_)\n" +
                                "(_.'\"\"\"\"._)");
                        System.out.println("                                                                _____|~~\\_____      _____________\n" +
                                "                                                           _-~               \\    |    \\\n" +
                                "                                                           _-    | X      |    |__/   \\   \\\n" +
                                "                                                           _-         )   |   |  |     \\  \\\n" +
                                "                                                           _-    | X      |    |--|      |  |\n" +
                                "                                                           __-_______________ /__/_______|  |_________\n");

                    }else if(userSearchContactName.equalsIgnoreCase("Carole")){
                        System.out.println("___________________________________\n" +
                                "|#######====================#######|\n" +
                                "|#(1)*UNITED STATES OF AMERICA*(1)#|\n" +
                                "|#**          /===\\   ********  **#|\n" +
                                "|*# {G}      | (\") |             #*|\n" +
                                "|#*  ******  | /v\\ |    O N E    *#|\n" +
                                "|#(1)         \\===/            (1)#|\n" +
                                "|##=========ONE DOLLAR===========##|\n" +
                                "------------------------------------");
                    }else if(userSearchContactName.equalsIgnoreCase("Sophie")){
                        System.out.println("  _           _  \n" +
                                ",|||.       ,|||.\n" +
                                "|||||       |||||\n" +
                                "|||||/)   (\\|||||\n" +
                                "\\,,, /     \\ ,,,/\n" +
                                "|___|       |___|");
                    }

                    keepLooking = true;
                    break;
                case 4:
                    //DELETE CONTACT
                    System.out.println("Enter contact's name: ");
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

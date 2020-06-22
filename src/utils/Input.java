package utils;

import java.util.Scanner;

public class Input {

        private Scanner sc;

        public Input() {
            this.sc = new Scanner(System.in).useDelimiter("\n");
        }

        public String getString() {
            return sc.nextLine();
        }

        public String getString(String prompt) {
            System.out.println(prompt);
            return sc.nextLine();
        }

        public boolean yesNo() {
            String input = sc.next();
            System.out.println(input);
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                return true;
            } else {
                return false;
            }
        }

        public int getInt() {
            String userInput = getString();
            try {
                int userInt = Integer.valueOf(userInput);
                return userInt;
            } catch(NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
                return getInt();
            }
        }

        public int getInt(int min, int max) {
            int userInt = getInt();
            if (userInt >= min && userInt <= max) {
                return userInt;
            } else {
                System.out.println("Please enter an integer in the correct range between " + min + " " + "and " + max);
                return getInt(min, max);
            }
        }

        public double getDouble() {
            String userInput = getString();
            try {
                double userDouble = Double.valueOf(userInput);
                return userDouble;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a valid number!");
                return getDouble();
            }
        }

        public double getDouble(double min, double max) {
            double userDouble = getDouble();
            if (userDouble >= min && userDouble <= max) {
                return userDouble;
            } else {
                System.out.println("Please enter a number in the correct range between " + min + " " + "and " + max);
                return getDouble(min, max);
            }
        }

        public static void main(String[] args) {
            Input in = new Input();


//        String favSentence = in.getString("Please enter your favorite sentence!");
//        System.out.println(favSentence);

//        System.out.print("Will you continue? ");
//        boolean yesNo = in.yesNo();
//        System.out.println(yesNo);

//        System.out.print("Please enter a whole number: ");
//        int num = in.getInt();
//        System.out.println("You entered: " + num);

//        System.out.print("Please enter a whole number between 1 and 10: ");
//        int numInRange = in.getInt(1, 10);
//        System.out.println("You entered " + numInRange);

            System.out.print("Please enter a number: ");
            double dNum = in.getDouble();
            System.out.println("You entered: " + dNum);

//        System.out.print("Please enter a whole number between 1 and 10: ");
//        double dNumInRange = in.getDouble(1, 10);
//        System.out.println("You entered " + dNumInRange);


        }

    }

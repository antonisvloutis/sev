package gr.aueb.sev.chapter5;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού επιλογών
 * με χρήση μεθόδων.
 */
public class MethodMenuDemo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do{
            //Give choice
            choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Insert successfully");
                    break;
                case 2:
                    System.out.println("Delete successfully");
                    break;
                case 3:
                    System.out.println("Update successfully");
                    break;
                case 4:
                    System.out.println("Search successfully");
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Δώστε επιλογή 1-5");
                    break;
            }
        }while (choice != 5);
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
        System.out.println("Δώστε επιλογή: ");
    }
}

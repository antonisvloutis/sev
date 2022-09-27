package gr.aueb.sev.Askisis.enotita8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Askisi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do{
            showMenu();
            try{
                choice = in.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Επιτυχής Εισαγωγή");
                        break;
                    case 2:
                        System.out.println("Επιτυχής Αναζήτηση");
                        break;
                    case 3:
                        System.out.println("Επιτυχής Ενημέρωση");
                        break;
                    case 4:
                        System.out.println("Επιτυχής Διαγραφή");
                        break;
                    case 5:
                        System.out.println("Έξοδος");
                        break;
                    default:
                        System.out.println("Παρακαλώ δώστε επιλογή 1 - 5");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println("Παρακαλώ δώστε αριθμό");
                in.nextLine();
            }
        } while (choice!=5);
        System.out.println("Αντίο");
    }
    public static void showMenu(){
        System.out.println("Επιλέξτε μία απο τις ακόλουθες ενέργειες.");
        System.out.println("1.Εισαγωγή");
        System.out.println("2.Αναζήτηση");
        System.out.println("3.Ενημέρωση");
        System.out.println("4.Διαγραφή");
        System.out.println("5.Έξοδος");
        System.out.println("Δώστε επιλογή: ");
    }
}

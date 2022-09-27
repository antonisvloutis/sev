package gr.aueb.sev.chapter4;

import java.util.Scanner;

/**
 * Λαμβάνει ένα αριθμό που συμβολίζει βαθμό,
 * απο τον χρήστη και εμφανίζει ένα κατάλληλο μήνυμα
 */
public class SwitchFallThroughDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade;
        System.out.println("Παρακαλω εισάγετε βαθμό: ");
        grade=in.nextInt();
        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Αποτυχία");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
                break;
            case 7:
            case 8:
                System.out.println("Λίαν καλώς");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Παρακαλώ δώστε βαθμό 1-10.");
                break;
        }


    }
}

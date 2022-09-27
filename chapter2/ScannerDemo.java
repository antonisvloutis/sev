package gr.aueb.sev.chapter2;

import java.util.Scanner;

/**
 * Διαβάζει δύο ακεραίους από το standard input
 * τους προσθέτει και εμφανίζει το αποτέλεσμα.
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //Δήλωση και Αρχικοποίηση Μεταβλητών
        Scanner in=new Scanner(System.in);
        int num1,num2;
        int sum;

        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum=num1+num2;
        System.out.printf("Το αποτέλεσμα των %d + %d = %d",num1,num2,sum);
    }
}

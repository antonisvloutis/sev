package gr.aueb.sev.chapter3;

import java.util.Scanner;

/**
 * Υπολογίζει αν κάποιος αριθμός είναι άρτιος
 */
public class EvenDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isEven = false;

        System.out.println("Insert a num");
        num=in.nextInt();

        isEven = (num % 2) == 0;
        /*if (isEven){
            System.out.println("Is Even");
        } else {
            System.out.println("Is Not Even");
        }*/
        System.out.printf("%d",(isEven) ? "Is even" : "Not even");
    }
}

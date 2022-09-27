package gr.aueb.sev.chapter3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψήφιων
 * ενός ακεραίου
 */
public class DigitsCountDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, count = 0;
        int result = 0;

        System.out.println("Δώστε ένα ακέραιο");
        num = in.nextInt();
        result = num;

        do{
            result = result / 10;
            count++;
        }while (result !=0);

        System.out.println("Το πλήθος των ψηφίων του "+num+" είναι: "+count);
    }
}

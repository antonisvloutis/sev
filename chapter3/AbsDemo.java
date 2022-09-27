package gr.aueb.sev.chapter3;

import java.util.Scanner;

/**
 *  Υπολογίζει το απόλυτο ένος αριθμού
 */
public class AbsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int abs = 0;

        System.out.println("Please insert a num");
        n = in.nextInt();

        /*if (n < 0) {
            abs = -n;
        } else {
            abs= n;
        }*/

        abs = (n<0) ? -n : n;

        System.out.printf("Abs of: %d = %d",n,abs);
    }
}

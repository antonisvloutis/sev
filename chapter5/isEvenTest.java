package gr.aueb.sev.chapter5;

import java.util.Scanner;

/**
 * Υπολογίζει αν κάποιος αριθμός είναι άρτιος
 */
public class isEvenTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;

        System.out.println("Insert a num");
        a = in.nextInt();
        isEven(a);
        isOdd(a);
    }
    public static boolean isEven(int a){
        return (a%2)==0;
    }
    public static boolean isOdd(int a){
        return (a%2)!=0;
    }

    /*public static void isEven(int num) {
        boolean even = false;
        even = (num % 2) == 0;
        if (even) {
            System.out.println("Is Even");
        } else {
            System.out.println("Is Not Even");
        }
    }
    public static void isOdd(int num) {
        boolean even = false;
        even = (num % 2) != 0;
        if (even) {
            System.out.println("Is Odd");
        } else {
            System.out.println("Is Not Odd");
        }
    }
*/
}

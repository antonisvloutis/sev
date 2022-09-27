package gr.aueb.sev.chapter3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού με επιλογές απο 1-3 η 0
 * για έξοδο. Δίνει feedback τι αριθμός έχει δωθεί.
 */
public class WhileMenuDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        /* Tropos 1
        int num=1;
        System.out.println("Δώσε έναν αριθμό");
        do {
            num=in.nextInt();
            System.out.println("Έδωσες "+num);
            if (num==0) System.out.println("Έξοδος.");
        }while(num!=0); */

        int num;
        do {
            System.out.println("Δώστε έναν αριθμό απο 1-3 ή 0 για έξοδο.");
            num = in.nextInt();
            if (num == 0) {
                System.out.println("Δώσατε το 0. Έξοδος.");
            } else if(num == 1){
                System.out.println("Δώσατε το 1");
            } else if(num == 2){
                System.out.println("Δώσατε το 2");
            } else if(num == 3){
                System.out.println("Δώσατε το 3");
            }
        }while(num!=0);
    }
}

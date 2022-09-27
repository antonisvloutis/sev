package gr.aueb.sev.chapter3;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη a^b
 */
public class PowerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0;
        int i=1;
        int result = 1;

        System.out.println("Input two integers to calculate a^b: ");

        a = in.nextInt();
        b= in.nextInt();

        while(i<=b){
            result *= a;
            i++;
        }

        System.out.printf("Η δύναμη %d εις την %d = %d ",a,b,result);

    }
}

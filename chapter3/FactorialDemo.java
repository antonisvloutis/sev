package gr.aueb.sev.chapter3;

import java.util.Scanner;

/**
 * Υπολογίζει το ν1, δηλ. 1*2*3...*ν
 */
public class FactorialDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int i=1;
        int result = 1;

        System.out.println("Input n: ");

        n = in.nextInt();

        while(i<=n){
             result*=i;
             i++;
        }

        System.out.printf("%d",result);

    }
}

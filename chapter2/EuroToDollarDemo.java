package gr.aueb.sev.chapter2;

import java.util.Scanner;

/**
 * Μετατρέπει ευρώ σε δολάρια ΗΠΑ
 * σύμφωνα με μία ισοτιμία
 */
public class EuroToDollarDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int RATE = 116;
        int inputEuros = 0;
        int totalUSACents = 0;
        int usaDollars = 0;
        int usaCents = 0;

        System.out.println("Παρακαλώ εισάγετε ποσό σε ευρώ");
        inputEuros = in.nextInt();
        totalUSACents = inputEuros * RATE;

        usaDollars = totalUSACents/100;
        usaCents = totalUSACents%100;
        System.out.printf("%d Euros = %d Dollars, %d Cents",inputEuros,usaDollars,usaCents);
    }
}

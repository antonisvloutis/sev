package gr.aueb.sev.chapter2;

import java.util.Scanner;

/**
 * Μετατρέπει ποσό ευρώ σε χαρτονομίσματα
 * των 500, 100, 50, 20 ,10 ευρώ καθώς και σε κέρματα
 * του ενός ευρώ
 */
public class EuroDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int euro500 = 0, euro100 = 0, euro50 = 0;
        int euro20 = 0, euro10 = 0;
        int remainingEuros=0;
        System.out.println("Παρακαλώ δώστε το ποσό σε Ευρώ");
        remainingEuros=in.nextInt();

        euro500 = remainingEuros / 500;
        remainingEuros = remainingEuros % 500;

        euro100 = remainingEuros / 100;
        remainingEuros = remainingEuros % 100;

        euro50 = remainingEuros / 50;
        remainingEuros = remainingEuros % 50;

        euro20 = remainingEuros / 20;
        remainingEuros = remainingEuros % 20;

        euro10 = remainingEuros / 10;
        remainingEuros = remainingEuros % 10;

        System.out.println("Το ποσό είναι: "+euro500+" πεντακοσάρικα, "+euro100+" εκατοστάρικα "+euro50+
                " πενηντάρικα "+euro20+" εικοσάρικα "+euro10+" δεκάευρα "+remainingEuros+" μονόευρα.");
    }
}

package gr.aueb.sev.chapter5;

import java.util.Scanner;

/**
 * Ελέγχει αν ένα τρίγωνο είναι ορθογώνιο.
 */
public class RightTriangleDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        final double EPSILON = 0.005;
        boolean isRight = false;

        System.out.println("Δώστε 3 τιμές για a, b, c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs(a*a - b*b - c*c) > EPSILON;

        System.out.printf("Το τρίγωνο %sείναι ορθογώνιο",(isRight) ? "" : "δεν ");
    }
}

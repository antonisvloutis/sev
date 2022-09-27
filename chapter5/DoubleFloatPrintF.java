package gr.aueb.sev.chapter5;

import java.util.Scanner;

public class DoubleFloatPrintF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d = 0.0;
        float f = 0.0f;
        double result=0.00;

        System.out.println("Δώστε δύο δεκαδικούς: ");
        d = in.nextDouble();
        f = in.nextFloat();

        result = d/f;
        System.out.printf("Result: %.2f",result);
    }
}

package gr.aueb.sev.Askisis.enotita2;

import java.util.Scanner;

public class Askisi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int F;
        System.out.println("Δώσε μια θερμοκρασία σε Φαρενάιτ: ");
        F = in.nextInt();
        F= 5 * (F-32) / 9;
        System.out.println("Σε βαθμούς Κελσίου: "+F);
    }
}

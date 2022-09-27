package gr.aueb.sev.Askisis.enotita2;

import java.util.Scanner;

public class Askisi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mera,mhnas,etos;

        System.out.println("Δώσε ημέρα, μήνα και έτος: ");
        mera= in.nextInt();
        mhnas= in.nextInt();
        etos= in.nextInt();

        System.out.printf("%d/%d/%d",mera,mhnas,etos);
    }
}

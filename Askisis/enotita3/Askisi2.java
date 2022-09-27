package gr.aueb.sev.Askisis.enotita3;

import java.util.Scanner;

public class Askisi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int epilogi=0;
        while(epilogi!=5){
            System.out.println("1.Εισαγωγή\n2.Διαγραφή\n3.Ενημέρωση\n4.Αναζήτηση\n5.Έξοδος\nΔώσε μία επιλογή: ");
            epilogi = in.nextInt();
            if(epilogi<=0 || epilogi>5){
                System.out.println("Δώσε μία επιλογή απο το 1 μέχρι το 5");
            }
            else{
                if(epilogi==1){
                    System.out.println("Επιλέξατε 1.Εισαγωγή");
                }
                else if(epilogi==2){
                    System.out.println("Επιλέξατε 2.Διαγραφή");
                }
                else if(epilogi==3){
                    System.out.println("Επιλέξατε 3.Ενημέρωση");
                }
                else if(epilogi==4){
                    System.out.println("Επιλέξατε 4.Αναζήτηση");
                }
                else{
                    System.out.println("Επιλέξατε 5.Εξοδος.");
                }
            }
        }
    }
}

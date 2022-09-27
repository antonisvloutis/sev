package gr.aueb.sev.Askisis.enotita5;

import java.util.Scanner;

public class Askisi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int epilogi;
        int n=1;

        do{
            showMenu();
            epilogi = in.nextInt();
            if((epilogi>=1)&&(epilogi<=5)){
                System.out.println("Δώσε αριθμό για αστεράκια");
                n = in.nextInt();
            }
            switch (epilogi){
                case 1:
                    StarsH(n);
                    break;
                case 2:
                    StarsV(n);
                    break;
                case 3:
                    StarsHV(n);
                    break;
                case 4:
                    StarsHVAsc(n);
                    break;
                case 5:
                    StarsHVDes(n);
                    break;
                case 6:
                    System.out.println("Αντίο");
                    break;
                default:
                    System.out.println("Παρακαλώ δώστε επιλογή απο 1 - 6");
                    break;
            }
        }while(epilogi!=6);
    }
    public static void showMenu(){
        System.out.println("Επιλέξτε: ");
        System.out.println("1.Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2.Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3.Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4.Εμφάνισε n γραμμές με 1-n αστεράκια");
        System.out.println("5.Εμφάνισε n γραμμές με n-1 αστεράκια");
        System.out.println("6.Για έξοδο");
        System.out.println("Δώσε μία επιλογή");
    }
    public static void StarsH(int n){
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
    }
    public static void StarsV(int n){
        for(int i=1;i<=n;i++){
            System.out.println("*");
        }
    }
    public static void StarsHV(int n){
        for(int i=1;i<=n;i++){
            StarsH(n);
            System.out.println();
        }
    }
    public static void StarsHVAsc(int n){
        for(int i=1;i<=n;i++){
            StarsH(i);
            System.out.println();
        }
    }
    public static void StarsHVDes(int n){
        for(int i=n;i>=1;i--){
            StarsH(i);
            System.out.println();
        }
    }

}

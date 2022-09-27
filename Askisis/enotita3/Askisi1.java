package gr.aueb.sev.Askisis.enotita3;

import java.util.Scanner;

public class Askisi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int etos;
        boolean isDisekto = false;
        System.out.println("Δώσε ένα έτος: ");
        etos = in.nextInt();

        if(etos%4==0){
            if((etos%100)==0){
                if(etos%400==0){
                    isDisekto=true;
                }
            } else {
                isDisekto=true;
            }
        }
        System.out.printf("Το έτος %d%sείναι δίσεκτο",etos,(isDisekto) ? " ":" δεν ");
    }
}

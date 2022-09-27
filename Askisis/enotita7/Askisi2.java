package gr.aueb.sev.Askisis.enotita7;

import java.util.Scanner;

public class Askisi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int key=1;
        String phrase;
        char decipher;

        System.out.println("Δώστε ένα αλφαριθμητικό για αποκρυπτογράφηση");
        phrase = in.next();

        for(int i = 0; i<phrase.length();i++){
            decipher=(char)(phrase.charAt(i)-key);
            System.out.println(decipher);
        }
    }
}

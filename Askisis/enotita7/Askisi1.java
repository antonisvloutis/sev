package gr.aueb.sev.Askisis.enotita7;

import java.util.Scanner;

public class Askisi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key=1;
        String phrase;
        char cipher;

        System.out.println("Δώστε ένα αλφαριθμητικό για κρυπτογράφηση");
        phrase = in.next();

        for(int i = 0; i<phrase.length();i++){
            cipher=(char)(phrase.charAt(i)+key);
            System.out.println(cipher);
        }
    }
}

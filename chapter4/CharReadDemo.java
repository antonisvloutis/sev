package gr.aueb.sev.chapter4;

import java.io.IOException;

/**
 * Διαβάζει χαρακτήρα-χαρακτήρα μέχρι να
 * βρει !
 */
public class CharReadDemo {
    public static void main(String[] args) throws IOException {
        char ch;

        do{
            System.out.println("Δώστε έναν χαρακτήρα: ");
            ch = (char) System.in.read();
            System.in.skip(2);
            System.out.println(ch);
        }while(ch != '!');
    }
}

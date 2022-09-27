package gr.aueb.sev.chapter7;

import java.sql.SQLOutput;

public class GenericStringMethods {
    public static void main(String[] args) {
        //int -> String
        String s = String.valueOf(1);

        //For classes -> toString();


        //String -> int
        int num = Integer.parseInt("2");

        String s1 = "AUEB";

        String s2 = s1.toLowerCase();
        String s3 = s1.toUpperCase();

        String s4 = "    AUEB  ".trim();
        System.out.println(s4);

        /*System.out.println("*".repeat(10));*/

        if(s4.isEmpty()) System.out.println("is empty");

    }
}

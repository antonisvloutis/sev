package gr.aueb.sev.chapter7;

import java.util.Scanner;

public class StringInit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = "Hello";
        System.out.println(s1);
        System.out.printf("%s",s1);

        System.out.println("\nPlease insert string: ");
        String s2 = sc.next();
        System.out.println("\nEcho: "+s2);

        System.out.println("\nPlease insert string: ");
        String s3 = sc.nextLine();
        System.out.println("\nEcho: "+s3);
    }
}

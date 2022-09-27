package gr.aueb.sev.chapter7;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert string: ");
        String s = in.nextLine();
        if(s.contains("u")){
            System.out.println(s.indexOf("u"));
        }
    }
}

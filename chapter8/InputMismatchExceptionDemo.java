package gr.aueb.sev.chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        while(true) {
            try {
                System.out.println("Insert an integer: ");
                num = in.nextInt();
                System.out.println(num);
                if(num==0)break;
            } catch (InputMismatchException e) {
                in.nextLine();
                //e.printStackTrace();
            }

        }
    }
}

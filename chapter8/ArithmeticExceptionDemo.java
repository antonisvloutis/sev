package gr.aueb.sev.chapter8;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        int result = 0;

        try{
            System.out.println("Insert two integers: ");
            num1 = in.nextInt();
            num2 = in.nextInt();

            result = num1 / num2;

            System.out.println(result);
        }catch(ArithmeticException e1){
            //e.printStackTrace();
            System.out.println("You can't divide with 0.");
        }catch(InputMismatchException e2){
            System.out.println("Only insert integers.");
        }catch(Exception e3){
            System.out.println("Oops... error.");
        }



    }
}

package gr.aueb.sev.chapter4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Υλοποιεί ένα mini calculator
 */
public class CalculatorDemo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num1, num2, result = 0;
        char ch;

        System.out.println("Παρακαλώ δώστε enter μετά απο κάθε σύμβολο ή αριθμό");

        num1 = in.nextInt();
        ch = (char) System.in.read();
        num2 = in.nextInt();

        switch(ch){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 !=0 ){
                result = num1 / num2;}
                else{
                    System.out.println("Δέν μπορείς να διαιρέσεις με το 0");
                }
                break;
            default:
                result = 0;
                break;
        }
        System.out.println("Το αποτέλεσμα είναι: "+result);
    }
}

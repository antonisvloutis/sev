package gr.aueb.sev.chapter5;

import java.util.Scanner;

public class MethodCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int num1 = 0, num2 = 0;
        do {
            printMenu();
            choice = in.nextInt();

            if (choice >= 1 && choice <= 5){
                System.out.println("Δώστε δύο ακεραίους: ");
                num1 = in.nextInt();
                num2 = in.nextInt();
            }
            switch (choice){
                case 1:
                    System.out.println("Sum: "+ add(num1,num2));
                    break;
                case 2:
                    System.out.println("Sum: "+ sub(num1,num2));
                    break;
                case 3:
                    System.out.println("Sum: "+ mul(num1,num2));
                    break;
                case 4:
                    System.out.println("Sum: "+ div(num1,num2));
                    break;
                case 5:
                    System.out.println("Sum: "+ mod(num1,num2));
                    break;
                case 6:
                    System.out.println("Έξοδος");
                    break;
                default:


            }
        } while (choice != 6);

    }
    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο");
        System.out.println("6. Έξοδος");
        System.out.println("Δώστε επιλογή: ");
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        /*if (b != 0){
            return a/b;
        }
        return 0;*/

        return (b != 0) ? a / b : 0;
    }
    public static int mod(int a,int b){
        return (b != 0) ? a % b : 0;
    }
}

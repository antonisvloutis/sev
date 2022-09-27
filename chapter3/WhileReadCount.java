package gr.aueb.sev.chapter3;

import java.util.Scanner;

public class WhileReadCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=0;
        int counter=0;
        System.out.println("Input a number: ");
        num= in.nextInt();

        while(num<0){
            System.out.println("The number was negative. Input new number: ");
            num= in.nextInt();
            counter++;
        }
        System.out.println("The last given number was: "+num+". You gave: "+counter+" negative numbers");
    }
}
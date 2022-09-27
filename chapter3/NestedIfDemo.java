package gr.aueb.sev.chapter3;

import java.util.Scanner;

/**
 * Δέχεται ως είσοδο πλήθος μαθημάτων και
 * σύνολο βαθμολογίες και δίνει τον μέσο όρο
 */
public class NestedIfDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modulesCount=0;
        int totalMarks=0;
        int average;

        System.out.println("Δώστε πλήθος μαθημάτων και σύνολο βαθμολογίας");
        modulesCount = in.nextInt();
        totalMarks = in.nextInt();

        if(modulesCount != 0){
            average = totalMarks / modulesCount;
            if (average >= 5){
                if(average <= 6){
                    System.out.println("Καλώς" + average);
                } else if (average <= 8) {
                    System.out.println("Λίαν καλώς" + average);
                } else {
                    System.out.println("Άριστα" + average);
                }
            } else {
                System.out.println("Αποτυχία");
            }
        } else {
            System.out.println("Το πλήθος των μαθημάτων δεν μπορεί να είναι 0");
        }
    }
}

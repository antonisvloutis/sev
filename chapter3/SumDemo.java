package gr.aueb.sev.chapter3;

/**
 * Υπολογίζει το άθροισμα 1-10
 */
public class SumDemo {
    public static void main(String[] args) {
        int sum=0;
        int i=1;

        while (i<=10){
            sum += i;
            i++;
        }
        System.out.println("Sum10: = "+sum);
    }
}

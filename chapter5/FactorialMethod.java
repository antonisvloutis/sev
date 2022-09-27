package gr.aueb.sev.chapter5;

import java.math.BigInteger;

/**
 * Υπολογίζει τον n1 με μέθοδο
 */
public class FactorialMethod {
    public static void main(String[] args) {

        int n = 100;
        BigInteger facto = new BigInteger("0");

        //facto = factorial(n);

        System.out.printf("%d! = %d",n,factorial(n));

    }

    /**
     * Finds n!
     *
     * @param n     number if the factorial
     * @return      factorial n
     */
    public static BigInteger factorial(int n) {
        BigInteger facto = new BigInteger("1");
        for(int i = 1; i <= n; i++){
            facto = facto.multiply(BigInteger.valueOf(i));
        }
        return facto;
    }
}

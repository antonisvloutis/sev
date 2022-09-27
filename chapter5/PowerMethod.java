package gr.aueb.sev.chapter5;

public class PowerMethod {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int result = 0;

        result = pow(a,b);

        System.out.printf("Power of %d^%d = %d",a,b,result);
    }

    /**
     *  Estimates a^b.
     *
     * @param a     the base
     * @param b     the power
     * @return      the power a^b
     */
    public static int pow(int a, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
}

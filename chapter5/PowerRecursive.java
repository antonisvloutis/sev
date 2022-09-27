package gr.aueb.sev.chapter5;

public class PowerRecursive {
    public static void main(String[] args) {
        System.out.println("pow(2, 0): "+ pow(2,0));
    }

    /**
     * Evaluates a^b
     * @param a the base
     * @param b the power
     * @return a^b
     */
    public static int pow(int a, int b){
        /*if(b==0) return 0;
        return a=pow(a,b-1);*/
        return (b==0) ? 1 : a * pow(a,b-1);
    }
}

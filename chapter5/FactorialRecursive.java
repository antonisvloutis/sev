package gr.aueb.sev.chapter5;

public class FactorialRecursive {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Facto of " + n + " = " + facto(n));
    }
    public static int facto(int n){
        if (n <= 1) {
            return 1;
        }
        else
        { return n * facto(n-1);
        }
    }
}

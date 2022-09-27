package gr.aueb.sev.chapter5;


public class FiboDemo {
    public static void main(String[] args) {
        System.out.println("Fibonacci 7: "+fibo(7));
    }
    public static int fibo(int n){
        if (n<0) return -1;
        if (n==0) return 0;
        if(n==1) return 1;

        return fibo(n-1)+fibo(n-2);
    }
}

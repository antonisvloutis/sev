package gr.aueb.sev.chapter5;

public class SwapDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.printf("a = %d, b = %d", a, b);
    }
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}

package gr.aueb.sev.chapter5;

public class MethodAddDemo {
    public static void main(String[] args) {

        int sum = 0;

        sum = add(3,5);

        System.out.println("Sum is: " + sum);
    }
    public static int add(int a, int b){
        /*int sum = 0;
        sum = a + b;
        return sum;*/
        return a + b;
    }
}

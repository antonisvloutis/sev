package gr.aueb.sev.chapter4;

public class ForSumMulDemo {
    public static void main(String[] args) {
        int sum = 0;
        int result = 1;

        for(int i = 1; i <= 10; i++){
            sum += 1;
            result *= i;
        }
        System.out.printf("Sum: %d, Mul: %d",sum,result);
    }
}

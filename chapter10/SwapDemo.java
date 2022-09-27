package gr.aueb.sev.chapter10;

public class SwapDemo {
    public static void main(String[] args) {
        int[] grades = {1,7};
        swap(grades);
        System.out.printf("grades[0]: %d, grades[1]: %d\n",grades[0],grades[1]);
    }
    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}

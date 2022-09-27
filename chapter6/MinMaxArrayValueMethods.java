package gr.aueb.sev.chapter6;

public class MinMaxArrayValueMethods {
    public static void main(String[] args) {
        int[] arr = {15, 6, 22, 76, 112, 33};
        System.out.printf("MinValue: "+getMinValue(arr)+"\nMaxValue: "+getMaxValue(arr));
    }

    public static int getMinValue(int[] arr) {
        int minValue=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int getMaxValue(int[] arr) {
        int maxValue=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}

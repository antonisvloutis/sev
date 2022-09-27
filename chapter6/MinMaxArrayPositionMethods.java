package gr.aueb.sev.chapter6;

public class MinMaxArrayPositionMethods {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 10, 2, 7, 8};
        System.out.printf("MinPosition: %d, MinValue: %d, \nMaxPosition: %d," +
                " MaxValue= %d",getMinPosition(arr)+1,arr[getMinPosition(arr)],getMaxPosition(arr)+1,arr[getMaxPosition(arr)]);
    }

    public static int getMinPosition(int[] arr) {
        int minPosition = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                minPosition = i;
            }
        }
            return minPosition;
    }

    public static int getMaxPosition(int[] arr) {
        int maxPosition = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    }


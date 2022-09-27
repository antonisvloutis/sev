package gr.aueb.sev.chapter10;

import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] ages = {15,19,35,20,18,7};
        Arrays.sort(ages);
        int value = 27;

        int position = binarySearch(ages,27,0,ages.length-1);

        for(int age : ages){
            System.out.print(" "+age);
        }
        System.out.printf(" Item %d, Position: %d\n",value,position+1);
    }
    public static int binarySearch(int[] arr, int value,int low, int high){
        if(high < low) return -1;
        int median = (low + high) / 2;

        if(arr[median] == value) return median;

        if(value < arr[median]) {
            return binarySearch(arr,value,low,median-1);
        } else {
            return binarySearch(arr,value,median + 1, high);
        }
    }
}

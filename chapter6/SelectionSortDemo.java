package gr.aueb.sev.chapter6;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] arr = {35, 24, 19, 33, 27, 20, 18};
        int minPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            minPosition = i;
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i] < arr[minPosition]) {
                    minPosition = j;
                }
            }
            swap(arr, i, minPosition);
            }
        for(int item:arr){
            System.out.println(item);
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}

package gr.aueb.sev.chapter6;

/**
 * Δηλώνει και αρχικοποιεί έναν πίνακα
 */
public class ArrayInit {
    public static void main(String[] args) {
        // Declaration
        int[] arr = new int[3];

        // Populate
        arr[0] = 0;
        arr[1] = 5;
        arr[2] = 8;

        // Print array items
        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i]+ " ");

        for (int item : arr){
            System.out.print(item);

        }
        }
    }
}

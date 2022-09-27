package gr.aueb.sev.chapter6;

public class GetArrayPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int positionToUpdate;
        positionToUpdate = getPosition(arr,8);
        arr[positionToUpdate]=10;

        for(int item : arr){
            System.out.print(item+"");
        }
    }

    /**
     * searches an array to find an element with
     * a certain value
     * @param arr the array to search
     * @param num number to find
     * @return  the position if the element is found, otherwise -1.
     */
    public static int getPosition(int[] arr, int num){

        for (int i=0;i< arr.length;i++){
            if (arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}

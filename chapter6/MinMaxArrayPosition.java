package gr.aueb.sev.chapter6;

public class MinMaxArrayPosition {
    public static void main(String[] args) {
        int[] grades = {6,3,9,10,2,7,8};

        int minPosition=0;
        int maxPosition=0;

        for(int i = 0; i < grades.length; i++){
            if (grades[i]<grades[minPosition]){
                    minPosition=i;
            }
            if(grades[i]>grades[maxPosition]){
                    maxPosition=i;
            }
        }
        System.out.printf("MinPosition: %d, MinValue: %d, \nMaxPosition: %d," +
                " MaxValue= %d",minPosition+1,grades[minPosition],maxPosition+1,grades[maxPosition]);
    }
}

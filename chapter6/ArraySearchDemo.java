package gr.aueb.sev.chapter6;

public class ArraySearchDemo {
    public static void main(String[] args) {
        int[] grades = {9,10,1,5,6};
        boolean found=false;
        int position=0;

        for(int i=0;i<grades.length;i++){
            if(grades[i]==5){
                found=true;
                position=i;
                break;
            }
        }
        System.out.printf("%sFound: %d",(found)?"":"Not ",(grades[position]));
    }
}

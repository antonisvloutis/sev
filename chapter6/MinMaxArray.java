package gr.aueb.sev.chapter6;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] ages = {15,6,22,76,112,33};
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i=0;i<ages.length;i++){
            if(ages[i]<minValue){
                minValue=ages[i];
            }
            if(ages[i]>maxValue){
                maxValue=ages[i];
            }
        }
        System.out.println("MinValue: "+minValue+"\nMaxValue: "+maxValue);
    }
}

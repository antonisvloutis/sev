package gr.aueb.sev.Askisis.enotita6;

public class Askisi {
    public static void main(String[] args) {
        int[] marks = {6,7,4,4,11};
        int minValue,minPosition,secondMinValue,secondMinPosition;
        minValue=minPosition=secondMinValue=secondMinPosition=Integer.MAX_VALUE;

        for(int i=0; i<marks.length;i++){
            if(marks[i]<minValue){
                secondMinValue=minValue;
                secondMinPosition=minPosition;
                minValue=marks[i];
                minPosition=i;
            }
            else if((marks[i]<secondMinValue)&&(marks[i]!=minValue)){
                secondMinValue=marks[i];
                secondMinPosition=i;
            }
        }
        System.out.printf("MinValue = %d & MinPosition = %d\n",minValue,minPosition+1);
        System.out.printf("Second MinValue = %d & SecondMinPosition = %d",secondMinValue,secondMinPosition+1);
    }
}

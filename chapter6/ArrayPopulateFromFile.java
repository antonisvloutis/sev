package gr.aueb.sev.chapter6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayPopulateFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("C:/test/array.txt");
        Scanner in = new Scanner(inFile);
        int[] ages = new int[5];

        for(int i = 0; i < ages.length; i++){
            ages[i] = in.nextInt();
        }

        for(int age : ages){
            System.out.print(age+" ");
        }
    }
}

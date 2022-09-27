package gr.aueb.sev.chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Διαβάζει απο αρχείο χαρακτήρων
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        String line;
        String[] cities;

        try(BufferedReader br = new BufferedReader(new FileReader("C:/test/cities-in.txt"));
            PrintStream ps = new PrintStream("C:/test/cities-out.txt")){

            while((line = br.readLine()) != null){
                cities = line.split(" +");
                printCities(ps,cities);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void printCities(PrintStream ps, String[] cities){
        for(String city : cities){
            ps.println(" " + city);
        }
        ps.println();
    }
}

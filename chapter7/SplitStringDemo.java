package gr.aueb.sev.chapter7;

/**
 * Splits a string based on a Regex
 */

public class SplitStringDemo {
    public static void main(String[] args) {
        String aueb = "Athens University of Economics and Business";

        String[] tokens = aueb.split(" ");
        for(String token : tokens){
            System.out.println(token);
        }
    }
}

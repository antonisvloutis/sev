package gr.aueb.sev.chapter7;

public class SubStringDemo {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        for(int i=0;i<s.length();i++){
            System.out.print(s.substring(i,i+1));
        }
    }
}

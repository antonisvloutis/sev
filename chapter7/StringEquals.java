package gr.aueb.sev.chapter7;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        boolean areEqual= s1.equals(s2);
        //boolean areEqual= s1.equalsIgnoreCase(s2); agnoei kefalaia
        if(s1.compareTo(s2)==0){
            System.out.println("EQUAL");
        } else if (s1.compareTo(s2)<0) {
            System.out.println("s1<s2");
        }
        else{
            System.out.println("s1>s2");
        }
    }
}

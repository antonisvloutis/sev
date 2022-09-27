package gr.aueb.sev.chapter7;

public class StringEqualsMethod {
    public static void main(String[] args) {

    }
    public static boolean areEqual(String s1, String s2){
        return (s1!=null) && (s1.equals(s2));
    }

    public static int compareTo(String s1, String s2){
       /* if(s1==null){
            throw new RuntimeException();
        }
        else*/
            return s1.compareTo(s2);

    }
}

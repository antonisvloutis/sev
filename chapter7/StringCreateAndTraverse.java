package gr.aueb.sev.chapter7;

public class StringCreateAndTraverse {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        for(int i = 0; i < s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}

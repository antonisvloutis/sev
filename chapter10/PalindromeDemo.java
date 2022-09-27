package gr.aueb.sev.chapter10;

public class PalindromeDemo {
    public static void main(String[] args) {
        String s = "madam";

        System.out.printf("%s is%spalindrome",s,isPalindrome(s) ? " " : " not ");
    }
    public static boolean isPalindrome(String s){
        boolean isPal = true;
        for(int i = 0, j= s.length()-1;i<j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                isPal = false;
                break;
            }
        }
        return isPal;
    }
}

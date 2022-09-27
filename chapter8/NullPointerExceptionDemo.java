package gr.aueb.sev.chapter8;


public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String s = null;

        if(s.equals("Hello")){
            System.out.println("Hello");
        }
    }
}

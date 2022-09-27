package gr.aueb.sev.chapter7;

public class StringReplaceDemo {
    public static void main(String[] args) {
        String s = "Athens- University- of Economics and Business";

        s = s.replace("-","");
        s = s.replace("E","e");
        System.out.println(s);
    }
}

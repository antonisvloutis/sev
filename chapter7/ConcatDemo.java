package gr.aueb.sev.chapter7;

public class ConcatDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        //String s3 = s1+" "+s2;
        String s3 = s1.concat(" ").concat(s2);
        System.out.println(s3);
    }
}

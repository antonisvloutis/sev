package gr.aueb.sev.chapter9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class FileAppendDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps = new PrintStream(new FileOutputStream("C:/test/append.txt",true));
        ps.println("Hello");

        PrintStream ps2 = new PrintStream(new FileOutputStream("C:/test/append2.txt",true),
                true,"UTF-8");
        ps2.println("Hello");
    }
}

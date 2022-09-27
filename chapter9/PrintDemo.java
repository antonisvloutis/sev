package gr.aueb.sev.chapter9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Demonstrates PrintStream and PrintWriter
 */
public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException {
       try(PrintStream ps = new PrintStream("C:/test/hello.txt","UTF-8");
           PrintWriter pw = new PrintWriter("C:/test/hello2.txt","Windows-1252");) {

           ps.println("Hello");
           pw.println("Hello2");
           pw.flush();
       }catch (FileNotFoundException | UnsupportedEncodingException e){
           System.out.println("File not found.");
       }


    }
}

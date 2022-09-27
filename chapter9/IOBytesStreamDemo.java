package gr.aueb.sev.chapter9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOBytesStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("C:/test/v1.mp4");
        FileOutputStream fos= new FileOutputStream("C:/test/v1-out.mp4");
        int b,count=0;
        byte[] buf = new byte[8192];

        long timeStart = 0,timeEnd = 0;
        double elapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        while((b=fs.read(buf))!=-1){
            fos.write(buf,0,b);
            count+=b;
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000D;
        System.out.printf("File size = %,.0f ", Math.ceil((double)count / 1024));
        System.out.println("Elapsed time: :"+elapsedTime);
    }
}

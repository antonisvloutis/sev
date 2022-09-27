package gr.aueb.sev.chapter2;

import java.util.Scanner;

public class SecondsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SEC_PER_DAY = 24 * 3600;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MINUTE = 60;

        int inputSeconds = 0;
        int days = 0, hours = 0, minutes = 0;
        int remainingSeconds = 0;

        System.out.println("Παρακαλώ δώσε δευτερόλεπτα");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds / SEC_PER_DAY;
        remainingSeconds = remainingSeconds % SEC_PER_DAY;

        hours = remainingSeconds / SEC_PER_HOUR;
        remainingSeconds = remainingSeconds % SEC_PER_HOUR;

        minutes = remainingSeconds / SEC_PER_MINUTE;
        remainingSeconds = remainingSeconds % SEC_PER_MINUTE;

        System.out.printf("Input Seconds: %d ,Days: %d , Hours: %d , Minutes: %d , Seconds: %d",
                inputSeconds,days,hours,minutes,remainingSeconds);

    }
}

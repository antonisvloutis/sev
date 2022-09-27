package gr.aueb.sev.chapter2;

/**
 * Εκχωρεί ενα int σε int και long.
 */
public class OverflowTypecastDemo {
    public static void main(String[] args) {
        long num= 2_147_483_647L;
        int i=20;
        long myLong=40;

        i=(int) myLong;

        long result=myLong+3;

        System.out.println(result);
        System.out.println("Το αποτέλεσμα είναι: "+result);
        System.out.printf("Το αποτέλεσμα είναι: %,06d ",result);
        System.out.printf("Το αποτέλεσμα είναι: %d",num);
    }
}

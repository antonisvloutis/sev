package gr.aueb.sev.chapter1;

/**
 * Προσθέτει δύο ακεραίους και
 * εμφανίζει το αποτέλεσμα στην κονσόλα.
 */
public class ExpressionDemo {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1=12;
        int num2=5;
        int sum=0;

        // Εντολές / Expressions
        sum=num1+num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Το αποτέλεσμα των "+num1+"+ "+num2+" είναι: "+sum);
        //System.out.printf("Το αποτέλεσμα των %d + %d είναι: %d",num1,num2,sum);
    }
}

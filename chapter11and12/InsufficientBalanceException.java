package gr.aueb.sev.chapter11and12;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(double balance,double amount){
        super("Insufficient balance: "+balance+" for amount: "+amount);
    }
}

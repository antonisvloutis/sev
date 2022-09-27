package gr.aueb.sev.chapter11and12;

import java.io.FileNotFoundException;

public class AccountDemo {
    public static void main(String[] args) throws Exception {
        Account alice = new Account();
        Account bob = new Account(1,"GR123","Dylan","Bob","123",1000);

        try{
            bob.deposit(1000);
            bob.withdraw(500,"123");
            System.out.println(bob.getAccountState());

        } catch (NegativeAmountException e1) {
            System.out.println("Something went wrong with this transaction...");
        } catch (InsufficientBalanceException | FileNotFoundException e2){
            System.out.println(e2.getMessage());
        }

    }
}

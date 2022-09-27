package gr.aueb.sev.chapter11and12;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Account {
    private long id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public Account(){

    }

    public Account(long id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Deposits an amount to the account
     * @param amount    The amount of money to deposit
     * @throws Exception    if negative amount
     */
    public void deposit(double amount) throws NegativeAmountException, FileNotFoundException {
        if(amount>0){
            balance += amount;
        } else{
            try{
                throw new NegativeAmountException(amount);
            }catch (NegativeAmountException e){
                System.err.println("Negative amount");
                throw e;
            }
        }
    }

    /**
     * Withdraws an amount from the account
     * * @param amount      the amount of money to withdraw
     * * @throws Exception  if insufficient balance
     */
    public void withdraw(double amount,String ssn) throws InsufficientBalanceException, FileNotFoundException {
        if(!isSsnValid(ssn)){
            logErrorMessage(new PrintStream("C:/test/ssn-error-log.txt"),"SSN is not valid.");
            return;
        }
        if(amount <= balance){
            balance -= amount;
        }else{
            try{
                throw new InsufficientBalanceException(balance,amount);
            }catch (Exception e){
                //System.err.println("Insufficient amount");
                logErrorMessage(new PrintStream("C:/test/error.txt"),"Insufficient balance.");
                throw e;
            }
        }
    }
    /**
     * * Gets the account's balance
     * * @return
     */
    public double getAccountBalance(){
        return getBalance();
    }

    /**
     * Prints account's state.
     *
     * *@return
     */
    public String getAccountState(){
        return "Id: " + id + ", firstname" + firstname + ",lastname" + lastname +
                ", IBAN" + iban + ", SSN" + ssn + ", Balance" + balance;
    }
    private void logErrorMessage(PrintStream ps, String message){
        ps.println(message);
    }
    private boolean isSsnValid(String ssn){
       // if (ssn!=null) return false;

        return this.ssn.equals(ssn);
    }
}

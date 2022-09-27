package gr.aueb.sev.chapter17.accounts.model;

public class Account extends AbstractEntity implements IdentifiableEntity {
    private String iban;
    private User holder;
    private double balance;

    public Account(){}

    public Account(Long id,String iban, User holder, double balance) {
        super.setId(id);
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

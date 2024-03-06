import java.time.LocalDate;

public class Account {
    private String name;
    private LocalDate date_of_birth;
    private double balance;

    public Account(String name, LocalDate date_of_birth, double balance) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.balance = balance;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public LocalDate get_date_of_birth() {
        return date_of_birth;
    }

    public void set_date_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public double get_balance() {
        return balance;
    }

    public void deposit_amount(double amount) {
        this.balance += amount;
    }

    public boolean withdraw_amount(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

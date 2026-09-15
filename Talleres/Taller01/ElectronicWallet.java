public class ElectronicWallet {
    private String owner = "";
    private double balance = 0;

    public ElectronicWallet(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean topUp(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean pay(double amount) {
        if (amount > 0 && amount <= balance && amount <= 500000) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

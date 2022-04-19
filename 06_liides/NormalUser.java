public class NormalUser implements User {
    private String name;
    private double balance;
    private int id;

    public NormalUser(String name, double balance, int id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public void depositMoney(double amount) {
        // Tavakasutaja sissemaksetelt makstakse käibemaksu
        amount -= amount * 0.2;
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}
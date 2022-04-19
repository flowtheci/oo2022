public class BusinessUser implements User {
    private String name;
    private double balance;
    private int id;

    public BusinessUser(String name, double balance, int id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public void depositMoney(double amount) {
        // Ärikliendid saavad 100% oma sissemaksest
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}
public class Start {
    public static void main(String[] args) {
        User user = new NormalUser("Eraklient", 100, 1);
        User user2 = new BusinessUser("Äriklient", 100, 2);

        user.depositMoney(100);
        user2.depositMoney(100);

        System.out.println("Erakliendi saldo: " + user.getBalance());
        System.out.println("Ärikliendi saldo: " + user2.getBalance());

    }
}

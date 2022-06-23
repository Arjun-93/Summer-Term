package practice;

// Question 5
public class creditcard {
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    creditcard(String no, String nm, String bk, double bal, int lim) {
        number = no;
        name = nm;
        bank = bk;
        balance = bal;
        limit = lim;
    }   

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    public boolean chargelt(double price) {
        if (price + balance > (double) limit)
            return false;
        balance += price;
        return true;
    }

    public void makePayment(double payment, int interestrate) {
        double x = payment * (interestrate / 100);
        if (latefee() == true) {
            int lfees = 100;
            balance = balance - (payment + x + lfees);
        }
        balance = balance - (payment + x);
    }

    private boolean latefee() {
        return false;
    }

    public static void printCard(creditcard c) {
        System.out.println("Card Number " + c.getNumber());
        System.out.println("Name " + c.getName());
        System.out.println("Bank " + c.getBank());
        System.out.println("Balance " + c.getBalance());
        System.out.println("Limit " + c.getLimit());
    }
}

class test {
    public static void main(String[] args) {
        creditcard wallet = new creditcard("5391 0375 9837 5309", "Lucy Alina", "Bank of Cannada", 0.0, 3500);
        for (int i = 0; i <= 16; i++) {
            wallet.chargelt((double) i);
            wallet.chargelt(2.0 * i);
        }
        creditcard.printCard(wallet);
        while (wallet.getBalance() > 100.0) {
            wallet.makePayment(100.0, 5);
            System.out.println("New Balance " + wallet.getBalance());
        }

    }
}
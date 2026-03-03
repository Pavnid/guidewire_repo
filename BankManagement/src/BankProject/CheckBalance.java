package BankProject;
class CheckBalance {

    double bal = 1000;  // starting balance

    void balance() {
        System.out.println("Balance: " + bal);
    }

    public static void main(String[] args) {
        CheckBalance c = new CheckBalance();
        c.balance();
    }
}
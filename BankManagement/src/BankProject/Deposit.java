package BankProject;

class Deposit {

    double bal = 1000;

    void deposit(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("Deposited: " + amt);
            System.out.println("New Balance: " + bal);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public static void main(String[] args) {
        Deposit d = new Deposit();
        d.deposit(500);
    }
}
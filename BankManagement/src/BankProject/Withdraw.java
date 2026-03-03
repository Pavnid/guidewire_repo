package BankProject;

class Withdraw {

    double bal = 1000;

    void withdraw(double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
            System.out.println("New Balance: " + bal);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }

    public static void main(String[] args) {
        Withdraw w = new Withdraw();
        w.withdraw(300);
    }
}
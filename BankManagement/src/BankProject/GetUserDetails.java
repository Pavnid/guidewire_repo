package BankProject;

import java.util.Scanner;

class GetUserDetails {

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Phone: " + phone);

        sc.close();
    }

    public static void main(String[] args) {
        GetUserDetails u = new GetUserDetails();
        u.getDetails();
    }
}

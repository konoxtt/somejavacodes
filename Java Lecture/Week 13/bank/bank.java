import java.util.Scanner;

class Bank {
    private String accno;
    private String name;
    private long balance;

    // Method to open an account
    void openAccount() {
        Scanner KB = new Scanner(System.in);
        System.out.print("Enter Account No: ");
        this.accno = KB.next();
        System.out.print("Enter Name: ");
        this.name = KB.next();
        System.out.print("Enter Balance: ");
        this.balance = KB.nextLong();
    }

    // Method to display account details
    void showAccount() {
        System.out.println(accno + "," + name + "," + balance);
    }

    // Method to deposit money
    void deposit() {
        Scanner KB = new Scanner(System.in);
        long amt;
        System.out.print("Enter Amount U Want to Deposit : ");
        amt = KB.nextLong();
        balance = balance + amt;
    }

    // Money transfer between 2 accounts
    void transfer1(int amount) {
        balance = balance - amount;
    }

    void transfer2(int amount) {
        balance = balance + amount;
    }

    // Method to withdraw money
    void withdrawal() {
        Scanner KB = new Scanner(System.in);
        long amt;
        System.out.print("Enter Amount U Want to withdraw : ");
        amt = KB.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }

    // Method to search an account number
    boolean search(String acn) {
        if (accno.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}

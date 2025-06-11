import java.util.Scanner;

class eBANK {
    public static void main(String arg[]) {
        Scanner KB = new Scanner(System.in);

        // Create initial accounts
        System.out.print("How Many Customer You Want to Input : ");
        int n = KB.nextInt();
        Bank C[] = new Bank[n];

        for (int i = 0; i < C.length; i++) {
            C[i] = new Bank();
            C[i].openAccount();
        }

        // Run loop until menu 6 is not pressed
        int ch;
        do {
             System.out.println("\t\tWELCOME TO ABC BANK");
            System.out.println("\\tChoose your needs");
            System.out.println("\t\t 1. Withdraw\n" + 
                                "\t\t 2. Deposit \n" + //
                                "\t\t 3. check balance\n" +
                                "\t\t 4. Show All Account\n" +
                                "\t\t 5. Send Money\n"  +
                                "\t\t 6. Search\n"  +
                                "\t\t 7. Add User\n"  +
                                "\t\t 8. EXIT \n");
            System.out.print("Enter Your Choice : ");
            ch = KB.nextInt();

            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.print("Enter Account Number You Want to Search...: ");
                    String acn = KB.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account No : ");
                    acn = KB.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    acn = KB.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;
                case 5:
                    System.out.println("Enter the amount of money to transfer ");
                    int tran = KB.nextInt();
                    System.out.print("Enter Sender Account No : ");
                    acn = KB.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            C[i].transfer1(tran);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    System.out.print("Enter Receiver Account No : ");
                    String acnt = KB.next();
                    boolean foundt = false;
                    for (int j = 0; j < C.length; j++) {
                        foundt = C[j].search(acnt);
                        if (foundt) {
                            C[j].transfer2(tran);
                            break;
                        }
                    }
                    if (!foundt) {
                        System.out.println("Search Failed..Transfer Account Not Exist..");
                    }
                    break;
                case 6:
                    System.out.print("Enter Account No : ");
                    acn = KB.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            C[i].showAccount();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break;

                case 7:
                    System.out.print("How Many Customer You Want to Input : ");
                    int m = KB.nextInt();
                    Bank[] newCustomers = new Bank[m];
                    for (int i = 0; i < m; i++) {
                        newCustomers[i] = new Bank();
                        newCustomers[i].openAccount();
                    }
                    // Combine old and new customers
                    Bank[] combined = new Bank[C.length + m];
                    System.arraycopy(C, 0, combined, 0, C.length);
                    System.arraycopy(newCustomers, 0, combined, C.length, m);
                    C = combined;
                    System.out.println("New Customers Added Successfully.");
                    break;
                case 8:
                    System.out.println("Good Bye..");
                    break;
            }
        } while (ch != 6);
    }
}

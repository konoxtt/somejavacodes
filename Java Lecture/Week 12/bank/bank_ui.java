import java.util.Scanner;

public class bank_ui {
    public static void main(String[] args) {
        bank bedri = new bank();
        Scanner gets = new Scanner(System.in);
        int user_balance = 1600; // we can get this from the database if we have
        bedri.balance = user_balance;

        System.out.println("\t\tWELCOME TO ABC BANK");
        System.out.println("\\tChoose your needs");
        System.out.println("\t\t 1. Withdraw\n" + 
                            "\t\t 2. Deposit \n" + //
                            "\t\t 3. check balance\n" +
                            "\t\t 4. EXIT \n");
        System.out.print("Enter the choice: ");
        int choice = gets.nextInt();


        if(choice == 1){

            System.out.println();
            System.out.println();
            System.out.println("The current balance is: " + bedri.check_balance());
            System.out.print("Enter the withdraw balance: ");
            int ww = gets.nextInt();
            bedri.change = ww;
            
            if(ww > user_balance){
                System.out.println("Your Balance is not enough");
            }
            
            else{
                System.out.println();
                System.out.println("Successfully withdrew: " + ww);
                System.out.println("New balance is: " + bedri.withdraw());
            }
        }
        
        else if(choice == 2){
            int deposit = (int)(Math.random() * 1001); // this random number since the user could deposit anything and the atm should count
            bedri.change = deposit;
            System.out.println("Successfully deposited new balance is: " + bedri.deposit());
        }
        
        else if(choice == 3){
            // bedri.change = 0;
            System.out.println("your balance is: " + bedri.check_balance());
        }
        
        else if(choice == 4){
            return;
        }
        
        else{
            System.out.println("Choose the correct choice.");
        }
        gets.close();
        
    }
}

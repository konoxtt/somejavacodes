
public class bank {

    int balance;
    int change;

    int withdraw(){
        balance -= change;
        return balance;
    }

    int deposit(){
        balance += change;
        return balance;
    }

    int check_balance(){
        return balance;
    }
}

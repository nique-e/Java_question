class bankAccount{

    private double balance;

    public bankAccount(double  initialBalance){
        balance = initialBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println(amount+ "desposit. current Balance :" +balance);

    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance = balance -amount;
            System.out.println(amount+ "withdraw.remaining balance :" +balance);

        }
        else{
            System.out.println("Insufficient balance! withdraw failed.");
        }
    }

    public void displayBalance(){

        System.out.println("Current Balance:" +balance);
    }
}

public class Bank{

    public static void main(String[] args) {
        
    }
}
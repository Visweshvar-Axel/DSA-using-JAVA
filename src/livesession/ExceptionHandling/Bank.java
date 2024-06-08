package livesession.ExceptionHandling;
class MinimumBalance extends Exception {
    MinimumBalance(){
        super("Minimum Balance");
        System.out.println("minimum ");
    }
}
public class Bank {
    private double balance;
    void deposit(double amount){
        balance += amount;
    }
    void withdrawn(double amount){
        if(balance < amount){
            throw n
        }
    }
}

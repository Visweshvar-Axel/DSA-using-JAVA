package livesession.ExceptionHandling;
class MinimumBalance extends Exception {
    MinimumBalance(){
        super("Minimum Balance from exception");
        System.out.println("minimum from constructor");
    }
}
public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
    }
    void withdrawn(double amount) throws MinimumBalance {
        if(balance < amount){
            throw new MinimumBalance();
        } else {
            balance -= amount;
        }
    }
    String checkBalance(){
        return "balance: "+balance;
    }

    public static void main(String[] args) throws MinimumBalance {
        Bank b = new Bank(500);
        System.out.println(b.checkBalance());
        b.deposit(400);
        System.out.println(b.checkBalance());
        b.withdrawn(800.0);
        System.out.println(b.checkBalance());
        try{
            b.withdrawn(500);
        } catch (MinimumBalance m) {
            System.out.println(m);
        }
        System.out.println("thank you........");
    }
}

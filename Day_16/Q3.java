package Day_16;

public class Q3 {
    public static void main(String[] args) {
        Account AccountDemo=new Account();
        AccountDemo.accountNumber=123;
        AccountDemo.deposit(1000);
        AccountDemo.withdraw(1100);
    }
}
class Account{
    int accountNumber;
    double balance;
    void deposit(int amount){
        this.balance=balance+amount;
        System.out.println(balance);
    }
    void withdraw(int amount){
        if(amount>balance){
            throw new ArithmeticException("InsufficientFundException");
        }
        this.balance=balance-amount;
        System.out.println(balance);



    }
}

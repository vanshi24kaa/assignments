package JUnit_Testing;

public class BankAccount {
    public double withDraw(double amount,double withdraw)
    {
        if(withdraw>amount)
        {
            throw new RuntimeException("Insufficient Balance");
        }
        else
        {
            return amount - withdraw;
        }
    }
}

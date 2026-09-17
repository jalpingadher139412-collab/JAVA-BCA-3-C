class InsBalException extends Exception
{
    public InsBalException(String message)
    {
        super(message);
    }
}

public class InsBalException
{
    private double balance;
    public InsBalException(double balance)
    {
        this.balance=balance;
    }

    public void withdraw(double amount) throws InsBalException
    {
        if(amount>balance)
        {
            throw new InsBalException("Insufficient balance in amount.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. \nRemaining balance: " + balance);
    }

    public static void main(String[] args)
    {
        InsBalException account = new InsBalException(1000.0);
        try
        {
            account.withdraw(600.0);
            account.withdraw(5000.0);
        }
        catch(InsBalException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
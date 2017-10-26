/**
A bank account has a balance that can be changed by 
deposits and withdrawals.
 */
public class BankAccount
{  
    private double balance;
    private String statement;
    /**
    Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {   
        balance = 0;
        statement="";
    }
    /**
    Constructs a bank account with a given balance.
    @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance)
    {   
        balance = initialBalance;
        statement="";
        statement+= "Deposit: " + balance + "\n";
    }
    /**
    Deposits money into the bank account.
    @param amount the amount to deposit to bank
     */
    public void deposit(double amount)
    {  
        balance = balance + amount;
        statement+= "Deposit: " + amount + "\n";
    }
    /**
    Withdraws money from the bank account.
    @param amount the amount to withdraw from bank
     */
    public void withdraw(double amount)
    {   
        balance = balance - amount;
        statement+= "Withdraw: " + amount + "\n";
    }
    /**
    Gets the current balance of the bank account.
    @return the current balance
     */
    public double getBalance()
    {   
        return balance;
    }
    /**
     * resets the statement for this 
     * BankAccount to be zero
     */
    public void reset()
    {
        statement = "";
    }
    
    /**
     * returns a string each time for transaction
     * @return statement to show the statement
     */
    public String getStatement()
    {
        
        return statement + "Balance: " + getBalance();
    }
}


public abstract class Account
    implements IRate
{
    // List common properties for savings and checking accounts
    private String     name;
    private String     SSN;
    private double     balance;

    private static int index = 10000;

    protected String   accountNumber;
    protected double   rate;

    // Constructor to set base properties and initialize account
    public Account(String name, String SSN, double initDeposit)
    {
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();

        // Set rate
        setRate();
    }


    public abstract void setRate();


    private String setAccountNumber()
    {
        String lastTwoSSN = SSN.substring(SSN.length() - 2);
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * 900) + 100;
        return lastTwoSSN + uniqueID + randomNumber;
    }


    public void compound()
    {
        double accruedInterest = balance * (rate / 100);
        System.out.println("Accrued Interest: $" + accruedInterest);
        balance += accruedInterest;
        printBalance();
    }


    // List common methods
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }


    public void withdraw(double amount)
    {
        balance -= amount;
        if (balance < 0)
        {
            balance += amount;
            System.out.println("Account does not have $" + amount + " to withdraw");
        }
        else
        {
            System.out.println("Withdrawing $" + amount);
            printBalance();
        }
    }


    public void transfer(String toWhere, double amount)
    {
        balance = balance -= amount;
        if (balance < 0)
        {
            balance += amount;
            System.out.println("Account does not have $" + amount + " to transfer");
        }
        else
        {
            System.out.println("Transferring $" + amount + " to " + toWhere);
            printBalance();
        }
    }


    public void printBalance()
    {
        System.out.println("Your balance is now: $" + balance);
    }


    public void showInfo()
    {
        System.out.println(
            "NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance
                + "\nRATE: " + rate + "%");
    }
}

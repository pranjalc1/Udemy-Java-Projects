public abstract class Account
    implements IRate
{
    // List common properties for savings and checking accounts
    String name;
    String SSN;
    double balance;
    
    static int index = 10000;

    String accountNumber;
    double rate;


    // Constructor to set base properties and initialize account
    public Account(String name, String SSN, double initDeposit)
    {
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber()
    {
        String lastTwoSSN = SSN.substring(SSN.length()-2);
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * 900) + 100;
        return lastTwoSSN + uniqueID + randomNumber;
    }

    // List common methods

    public void showInfo()
    {
        System.out.println(
            "NAME: " + name +
            "\nACCOUNT NUMBER: " + accountNumber + 
            "\nBALANCE: " + balance
        );
    }
}

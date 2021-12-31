public class Checking
    extends Account
{
    // List properties specific to checking account
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String SSN, double initDeposit)
    {
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
    }

    // List any methods specific to checking account
    public void showInfo()
    {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
    }
}

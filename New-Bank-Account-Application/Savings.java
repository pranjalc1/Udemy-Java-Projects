public class Savings
    extends Account
{
    // List properties specific to savings account
    int safetyDepositBoxID;
    int accessCode;

    // Constructor to initialize savings account properties
    public Savings(String name, String SSN, double initDeposit)
    {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
    }

    // List any methods specific to savings account
    public void showInfo()
    {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
    }
}

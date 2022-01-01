public class Savings
    extends Account
{
    // List properties specific to savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize savings account properties
    public Savings(String name, String SSN, double initDeposit)
    {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }


    private void setSafetyDepositBox()
    {
        safetyDepositBoxID = (int)(Math.random() * 900) + 100;
        safetyDepositBoxKey = (int)(Math.random() * 9000) + 1000;
    }


    // List any methods specific to savings account
    public void showInfo()
    {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println("\tYour Savings Account Features");
        System.out.println(
            "\tSafety Deposit Box ID: " + safetyDepositBoxID + "\n\tSafety Deposit Box Key: "
                + safetyDepositBoxKey);
    }


    @Override
    public void setRate()
    {
        rate = getBaseRate() - 0.25;
    }
}

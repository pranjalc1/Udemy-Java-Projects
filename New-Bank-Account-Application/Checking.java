public class Checking
    extends Account
{
    // List properties specific to checking account
    private long debitCardNumber;
    private int  debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String SSN, double initDeposit)
    {
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }


    // List any methods specific to checking account
    private void setDebitCard()
    {
        debitCardNumber = (long)(Math.random() * Math.pow(10, 11) * 9 + Math.pow(10, 11));
        debitCardPIN = (int)(Math.random() * 9000) + 1000;
    }


    public void showInfo()
    {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println("\tYour Checking Account Features");
        System.out.println(
            "\tDebit Card Number: " + debitCardNumber + "\n\tDebit Card PIN: " + debitCardPIN);
    }


    @Override
    public void setRate()
    {
        rate = getBaseRate() * 0.15;
    }
}

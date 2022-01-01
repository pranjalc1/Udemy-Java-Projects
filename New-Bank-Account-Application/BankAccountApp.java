import java.util.*;

public class BankAccountApp
{
    public static void main(String[] args)
    {
        /*
         * Checking chkacc1 = new Checking("Tom Wilson", "321456879", 1500);
         * Savings saveacc1 = new Savings("Rich Lowe", "456657897", 2500);
         * saveacc1.compound(); saveacc1.showInfo();
         * System.out.println("***********"); chkacc1.showInfo();
         */

        // Read a CSV file then create new accounts based on the data
        List<String[]> newCustomers = CSV.read("NewBankAccounts.csv");
        List<Account> accounts = new LinkedList<Account>();

        for (String[] customer : newCustomers)
        {
            if (customer[2].equals("Savings"))
            {
                accounts
                    .add(new Savings(customer[0], customer[1], Double.parseDouble(customer[3])));
            }
            else if (customer[2].equals("Checking"))
            {
                accounts
                    .add(new Checking(customer[0], customer[1], Double.parseDouble(customer[3])));
            }
            else
            {
                System.err.println("ERROR READING ACCOUNT TYPE");
            }
        }

        System.out.println("--------------------------------");
        for (Account acc : accounts)
        {
            acc.showInfo();
            System.out.println("--------------------------------");
        }
    }
}

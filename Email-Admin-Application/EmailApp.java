public class EmailApp
{
    public static void main(String[] args)
    {
        Email em1 = new Email("John", "Smith");

        em1.setMailboxCapacity(1000);
        em1.setAlternateEmail("john.smith@gmail.com");
        em1.changePassword("javaAtJavaCorp@006");

        em1.showInfo();
    }
}

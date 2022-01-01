public interface IRate
{
    // Write a method to return the base rate
    default double getBaseRate()
    {
        return 2.5;
    }
}

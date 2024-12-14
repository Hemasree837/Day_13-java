public class TryCatchFinally {
    public static void main(String args[])
    {
        try
        {
            int d=90/0;
        }
        catch(ArithmeticException v)
        {
           System.out.println("404 Error");
        }
        try
        {
            int d=90/0;
        }
        catch(ArithmeticException v)
        {
           System.out.println("Catch Block is Running");
        }
        finally
        {
            System.out.println("Finally is Running");
        }
    }
}

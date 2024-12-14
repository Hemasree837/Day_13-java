public class Throw1 {
    public static void main(String args[])
    {
        try{
            throw new Exception("Error");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

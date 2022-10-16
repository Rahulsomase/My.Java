package Day8;

public class que4 {
    public static void main(String args[])
    {
        int n, fact = 1, i = 0;
        try
        {
            n = Integer.parseInt(args[0]);
            for(i=1; i<=n; i++)
            {
                fact = fact * i;
            }
            System.out.println("Factorial of "+n+" is "+fact);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

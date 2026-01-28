import java.util.*;
public class prime 
{
    public static boolean  primeCheck(int n)
    {
        if(n == 2)
        {
            return true;
        }
        for(int i=2;i<=n-1;i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n)
    {
        for(int i=2; i<=n; i++)
        {
            if(primeCheck(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Last range number :");
        n = sc.nextInt();
        primeRange(n);
    }   
}

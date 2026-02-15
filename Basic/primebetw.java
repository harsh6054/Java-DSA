import java.util.*;
public class primebetw 
{
    public static void printPrime(int s,int e)
    {
        System.out.println("Prime Numbers Between "+s+" to "+e+" : ");
        for(int i=s;i<=e;i++)
        {
            if(i%2!=0)
            {
                System.out.print(" "+i);
            }
        }

    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int start,end;
        System.out.print("Enter Start Range Of Numbers :");
        start = sc.nextInt();
        System.out.print("Enter End Range Of Numbers :");
        end = sc.nextInt();
        printPrime(start,end);
    }     
}

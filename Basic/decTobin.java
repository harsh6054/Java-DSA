import java.util.*;
public class decTobin 
{
    public static void dectobin(int n)
    {
        int decNum = n;
        int pow=0;
        int binNum=0;
        while(n>0)
        {
            int rem = n % 2;
            binNum = binNum + (rem*(int)Math.pow(10, pow));
            pow ++;
            n = n/2;
        }
        System.out.println("Binary Number of " + decNum + "is :"+binNum);
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        int n =sc.nextInt();
        dectobin(n);
    }
}

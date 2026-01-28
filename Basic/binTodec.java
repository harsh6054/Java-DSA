import java.util.*;
public class binTodec 
{
    public static void bintodec(int n)
    {
        int binNum =n;
        int pow = 0;
        int decNum = 0;
        while(n>0)
        {
            int lastdigit = n % 10;
            decNum = decNum +(lastdigit * (int)Math.pow(2, pow));
            pow ++;
            n = n/10;
        }
        System.out.println("Decimal Number Of " + binNum+ " is :"+decNum );
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int binNum;
        System.out.print("Enter binary Number :");
        binNum = sc.nextInt();
        bintodec(binNum);
    }    
}

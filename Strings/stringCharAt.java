import java.util.Scanner;

public class stringCharAt 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int n;
        System.out.print("Enter String :");
        str = sc.next();
        System.out.print("Enter Index :");
        n = sc.nextInt();
        System.out.println("Char At Index "+n+" is:"+str.charAt(n));
    }
}

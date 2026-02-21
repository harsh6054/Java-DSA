import java.util.*;
public class largestString 
{
    public static void findLargest(String[] a)
    {
        String largest = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i].length()>largest.length())
            {
                largest = a[i];
            }
        }
        System.out.println("Largest String :"+largest);
    }
    public static void main(String a[])
    {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Enter Total Number of String :");
        n = sc.nextInt();
        String[] arg=new String[n];
        for(int i=0; i<n;i++)
        {
            System.out.print("Enter "+i+" No Of String :");
            arg[i] = sc.next();
        }
        findLargest(arg);
    }
}

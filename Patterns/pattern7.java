import java.util.*;
public class pattern7 
{
    public static void invertedRotatedHalfPyramid_numbers(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1; j<=(n-i+1);j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main (String arg[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows :");
        n=sc.nextInt();
        invertedRotatedHalfPyramid_numbers(n);
    }
}

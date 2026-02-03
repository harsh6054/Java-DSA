import java.util.*;
public class pattern6 
{
    public static void invertedRotatedHalfPyramid(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1; j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String arg[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers of Lines:");
        n = sc.nextInt();
        invertedRotatedHalfPyramid(n);
    }    
}

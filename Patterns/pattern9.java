import java.util.*;
public class pattern9 
{
    public static void triangle_01(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers Of Rows :");
        n = sc.nextInt();
        triangle_01(n);
    }    
}

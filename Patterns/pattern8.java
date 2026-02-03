import java.util.*;
public class pattern8 
{
    public static void floydsTriangle(int n)
    {
        int no=1;
        for(int i= 1; i<=n; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(no+" ");
                no++;
            }
            System.out.println();
        }

    }
    public static void main(String arg[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers of Rows :");
        n = sc.nextInt();
        floydsTriangle(n);
    }
}

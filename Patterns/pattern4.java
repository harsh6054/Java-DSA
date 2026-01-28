import java.util.*;
public class pattern4 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        char ch = 'A';
        System.out.print("Enter Numbers Of Lines :");
        n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }    
}

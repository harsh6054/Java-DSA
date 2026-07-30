import java.util.*;

public class gridWays 
{
    public static int countWays(int i, int j, int n, int m)
    {
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
        else if(i == n || j == m)   
        {
            return 0;
        }

        int w1 = countWays(i+1, j, n, m);
        int w2 = countWays(i, j+1, n, m);

        return w1 + w2;
    }

    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Enter N (Rows): ");
        n = sc.nextInt();

        System.out.print("Enter M (Cols): ");
        m = sc.nextInt();

        System.out.println("Number of Possible ways: " + countWays(0, 0, n, m));
    }    
}
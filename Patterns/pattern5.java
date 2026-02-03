import java.util.*;
public class pattern5 
{
    public static void hollow_Rectangle(int r, int c)
    {
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=c; j++)
            {
                if(i==1 || i==r || j==1 || j==c)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.print("Enter Numbers Of Rows :");
        r = sc.nextInt();
        System.out.print("Enter Numbers Of Columns :");
        c = sc.nextInt();
        hollow_Rectangle(r,c);

    }    
}
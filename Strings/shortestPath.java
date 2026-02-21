import java.util.*;
public class shortestPath 
{   
    public static float findPath(String str)
    {
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++)
        {
            char dir = str.charAt(i);
            if( dir == 'w')
            {
                x--;
            }
            else if(dir == 's')
            {
                y--;
            }
            else if(dir == 'e')
            {
                x++;
            }
            else{
                y++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }    
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        String path;
        System.out.print("Enter Path (W,E,S,N) :");
        path = sc.next();
        path.toLowerCase();
        System.out.print("Shortest Path is :"+findPath(path));
    }
}

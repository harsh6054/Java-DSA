import java.util.*;
public class stringCompair 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.print("Enter String1 :");
        s1 = sc.next();
        System.out.print("Enter String2 :");
        s2 = sc.next();
        System.out.println("Comparession of Two String "+s1.compareTo(s2));
    }
}

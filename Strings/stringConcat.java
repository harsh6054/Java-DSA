import java.util.*;
public class stringConcat 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.print("Enter String 1 :");
        s1 = sc.next();
        System.out.print("Enter String 2 :");
        s2 = sc.next();
        String str = s1+s2;
        System.out.println("Combined String : "+str);
    }    
}

import  java.util.*;
public class subStringEx 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        int idx;
        String str;
        System.out.print("Enter Any String :");
        str = sc.next();
        System.out.print("Enter Index form start Substring :");
        idx = sc.nextInt();
        System.out.println("Substring : "+str.substring(idx));
    }
}

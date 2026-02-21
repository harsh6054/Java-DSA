import java.util.*;
public class stringpalindrome 
{
    public static void checkPalindrome(String s)
    {
        int n = s.length();
        boolean check = true;
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i) !=s.charAt(n-1-i))
            {
                check=false;
                break;
            }
        }
        if(check== true)
        {
            System.out.println("String are palindrome...");
        }else{
            System.out.println("String are not palindrome!!!!");
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter New String :");
        str = sc.next();
        checkPalindrome(str);
    }       
}

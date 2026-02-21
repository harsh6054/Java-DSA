import java.util.*;
public class compression 
{
    public static String compress(String str)
    {
        String s ="";
        for(int i=0;i<str.length();i++)
        {
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            s +=str.charAt(i);
            if(count >1)
            {
                s += count.toString();
            }
        }
        return s;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter Any String :");
        str = sc.next();
        System.out.println("Compress String :"+compress(str));
    }    
}

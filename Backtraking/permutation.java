import java.util.*;
public class permutation {
    public static void findPermutation(String str, String ans)
    {
        //base Case
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        //Kaam
        for(int i=0;i<str.length();i++)
        {
            char cur = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            findPermutation(newstr, ans+cur);
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter A String :");
        str =  sc.next();
        findPermutation(str, "");
    }
    
}

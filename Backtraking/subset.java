// Finding Subset by using concept of Backtracking
import java.util.*;
public class subset {
    public static void findSubset(String str, int i, String ans)
    {
        //base Case
        if(i == str.length())
        {
            if(ans.length() == 0)
            {
                System.out.print("Null ");
            }else{
                System.out.print(ans+" ");
            }
            return;
        }
        //if any char wants to join subset there are two choice Yes or No
        //No
        findSubset(str, i+1, ans);
        //yes
        findSubset(str, i+1, ans+str.charAt(i));
        
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter A String : ");
        str = sc.next();
        findSubset(str, 0, "");
    }
    
}

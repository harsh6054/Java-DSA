import java.util.*;
public class linearSearch {
    public static int linner_search(int n[],int k)
    {
        for(int i =0; i<n.length;i++)
        {
            if(n[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int numbers [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter Number to search :");
        int key = sc.nextInt();
        int pos = linner_search(numbers,key);
        System.out.println("Number Found At Position "+pos);
    }    
}

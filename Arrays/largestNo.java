import java.util.*;
public class largestNo 
{
    public static void largestno(int a[])
    {
        int len = a.length;
        int max=0;
        for(int i=0; i<len;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.print("Largest Number in array:"+max);
    }
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[20];
        System.out.print("Enter length of an array :");
        int len = sc.nextInt();
        for(int i= 0;i<len;i++)
        {
            System.out.print("Enter Arrays Number  :");
            arr[i]=sc.nextInt();
        }
        System.out.println();
        largestno(arr);
    }    
}

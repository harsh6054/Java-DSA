import java.util.*;
public class reverseArray 
{
    public static void arrayReverse(int arr[],int n)
    {
        int start = 0, last = n-1 ;
        while(start<last)
        {
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;
            start++;
            last--;
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }   
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int arr[] = new int[20];
        System.out.print("Enter Length of an Array :");
        n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter Array Element "+i+" :");
            arr[i] = sc.nextInt();
        }
        arrayReverse(arr,n);
    } 
}

import java.util.*;
public class pairsArray 
{
    public static void arrayPairs(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int cur =arr[i];
            for(int j =i+1;j<n;j++)
            {
                System.out.print(cur+":"+arr[j]+" ");
            }
            System.out.println();
        }
    }   
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int arr[] = new int[20];
        System.out.print("Enter Length of An Array :");
        n = sc.nextInt();
        for(int i=0; i<n;i++)
        {
            System.out.print("Enter Array Element "+i+ " :");
            arr[i] = sc.nextInt();
        }
        arrayPairs(arr, n);

    }
}

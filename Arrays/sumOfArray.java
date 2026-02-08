import java.util.*;
public class sumOfArray 
{
    public static void maxSumArray(int arr[],int n)
    {
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("Maximum Sum Of An Array is :"+sum);
    }    
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        int n;
        int arr[] = new int[20];
        System.out.print("Enter Length of an Arrray :");
        n = sc.nextInt();
        for(int i =0; i<n;i++)
        {
            System.out.print("Enter Array Element "+i+":");
            arr[i]=sc.nextInt();
        }
        maxSumArray(arr, n);
    }   
}

import java.util.*;

public class binarySearch 
{
    public static void binarySearchFun(int a[], int key, int n)
    {
        int start = 0, end = n - 1, mid;
        while (start <= end)
        {
            mid = (start + end) / 2;
            if (a[mid] == key)
            {
                System.out.println("Found At Index : " + mid);
                return;   // stop after found
            }
            else if (a[mid] > key)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        System.out.println("Element Not Found");
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int key, n;
        int arr[] = new int[100];
        System.out.print("Enter the length of Array : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter Array Element " + i + " : ");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, 0, n);
        System.out.print("Enter Search Element : ");
        key = sc.nextInt();
        binarySearchFun(arr, key, n);
    }    
}

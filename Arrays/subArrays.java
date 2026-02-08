import java.util.Scanner;

public class subArrays 
{
    public static void subArray(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                for(int k = i; k <= j; k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        int arr[] = new int[20];

        System.out.print("Enter Length of Array : ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Array Element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        subArray(arr, n);
    }       
}

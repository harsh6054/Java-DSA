public class backtrackOnArray {
    public static void changeArray(int arr[],int i,int val)
    {
        //baseCase
        if(i==arr.length)
        {
            printArray(arr);
            return;
        }
        //kaam
        arr[i]=val;
        changeArray(arr, i+1, val+1);
        //backtracking
        arr[i]=arr[i]-2;
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        int[] arr = new int[5];
        changeArray(arr,0,1);
        printArray(arr);
    }
    
}

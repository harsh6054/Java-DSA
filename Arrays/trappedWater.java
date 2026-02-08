public class trappedWater 
{
    public static void tarppedwater(int arr[])
    {
        int n = arr.length;
        
        //left max boundary;
        int leftMax[] = new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i] = Math.max(arr[i],leftMax[i-1]);
        }

        //right Max Boundary
        int rightMax[] = new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i] = Math.max(arr[i],rightMax[i+1]);
        }

        //trapped Water
        int tarpped = 0;
        for(int i=0;i<n;i++)
        {
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            tarpped += waterlevel-arr[i];
        }
        System.out.print("Trapped Water For Given Height :"+tarpped);
    }
    public static void main(String arg[])
    {
        int height[] = {4,0,3,2,5,6,4,0,3};
        System.out.print("Height Of Wall :");
        for(int i=0;i<height.length;i++)
        {
            System.out.print(" "+height[i]);
        }
        System.out.println();
        tarppedwater(height);
    }    
}

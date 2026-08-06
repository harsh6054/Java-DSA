public class movesZero 
{
    public static void moveZero(int nums[])
    {
        int left = 0;
        for(int right = 0 ; right < nums.length; right++)
        {
            if(nums[right] != 0)
            {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left ++;
            }
        }
    }
    public static void main(String a[])
    {
        int num[] = {0,1,0,3,12};
        System.out.print("Input : ");
        for(int i = 0 ; i < num.length; i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        moveZero(num);
        System.out.print("Output : ");
        for(int i = 0 ; i < num.length; i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}

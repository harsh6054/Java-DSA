//Container With Most Water 
import java .util.*;
public class ArrayList3 
{
    // Brute Force Approach
    public static int checkWaterB(ArrayList<Integer> height)
    {

        int maxWater = 0;
        for(int i=0;i<height.size();i++)
        {
            for(int j = i+1;j<height.size();j++)
            {
                int waterHeight = Math.min(height.get(i),height.get(j));
                int width = j - i;
                int currentWater = waterHeight * width;
                maxWater = Math.max(maxWater,currentWater);
            }
        }
        return maxWater;
    }


    //2 pointer Approach
    public static int checkWater2P(ArrayList<Integer> height)
    {
        int maxWater =0;
        int lp =0 , rp = height.size()-1;
        while(lp<=rp)
        {
            int h = Math.min(height.get(lp),height.get(rp));
            int w = rp - lp;
            int currentWater = h * w;
            maxWater =  Math.max(currentWater, maxWater);

            if(height.get(lp)< height.get(rp))
            {
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String a[])
    {
        ArrayList<Integer> height = new ArrayList<>();    
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Container With Moost Water Area : " +checkWaterB(height));
        //System.out.println("Container With Moost Water Area : " +checkWater2P(height));


    
    }
    
}

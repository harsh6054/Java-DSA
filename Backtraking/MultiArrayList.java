import java.util.*;
public class MultiArrayList 
{
    public static void main(String a[])
    {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for(int i = 1; i<=10;i++)
        {
            l1.add(i*2);
            l2.add(i*3);
            l3.add(i*4);
        }

        mainList.add(l1);  
        mainList.add(l2);        
        mainList.add(l3);        

        // for(int i=0;i<mainList.size();i++)
        // {
        //     for(int j=0;j<mainList.get(i).size();j++)
        //     {
        //         System.out.print(+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println(mainList);
    }    
}

//return sum of two element in arrayList equals to target value...
import java.util.*;
public class ArrayList4 
{
    public static boolean findTarget(ArrayList<Integer> list, int target)
    {
        for(int i = 0;i<list.size();i++)
        {
            for(int j = i+1;j<list.size();j++)
            {
                if(list.get(i) + list.get(j) == target)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String a[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(8);
        System.out.print("Enter Target : ");
        int target = sc.nextInt();

        if(findTarget(list, target))
        {
            System.out.println("Target Found in ArrayList  ");
        }else{
            System.out.println("Target Not Found in ArrayList  ");
        }
    }
}

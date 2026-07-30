import java.util.*;
public class ArrayList2 
{
    public static void main(String a[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(91);
        list.add(12);
        list.add(76);
        list.add(22);

        System.out.println("Original ArrayList : "+list);
        //Maximum Number in ArrayList
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                max = list.get(i);
            }
        }
        System.out.println("Maximum Number in ArrayList :"+max);


        //Revrse ArrayList
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

       

        //Sorting of ArrayList
        Collections.sort(list);;
        System.out.println(list);


        //Reverse by using comparatr
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After ArrayList Reverse :"+list);


        //swapping two numbers in Array List
        int idx1 = 2 , idx2 = 4;
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println("After Swapping ArrayList : "+list);

    }    
}

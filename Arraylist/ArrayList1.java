// All Opration on ArrayList 
import java.util.*;
public class ArrayList1 {
    public static void main(String a[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        //add opration
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Array Add Opration : "+list);

        // add Opration with index parameter
        list.add(3,25);
        list.add(6,100);
        System.out.println("ArrayList Add Opration with Index Parameter : "+list);

        //size method
        System.out.println("Length Of an ArrayList : "+list.size());

        //get method by using for loop
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }

        
        //remove method
        System.out.println("ArrayList before remove  : "+list);
        list.remove(3);
        System.out.println("ArrayList After remove  : "+list);

        //Arraylist set method
        System.out.println("ArrayList before set Method : "+list);
        list.set(3,200);
        System.out.println("ArrayList After set Method : "+list);

        // contains method
        if(list.contains(300))
        {
            System.out.println("Element Present");
        }else{
            System.out.println("Element Not Present");
        }
        if(list.contains(30))
        {
            System.out.println("Element Present");
        }else{
            System.out.println("Element Not Present");
        }
    }
}

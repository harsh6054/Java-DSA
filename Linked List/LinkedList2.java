//Linked List Implementation from Java Collection Farmework Operations
import java.util.LinkedList;
public class LinkedList2 
{
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();

    //Add Methods
    list.add(10);
    list.add(20);
    list.addFirst(100);
    list.addLast(999);
    list.add(2,50);  //index Start From 0
    list.push(0);  //Add Element In Linked List at First Position Like stack

    //print Linked List
    System.out.println("Add Method Linked List : "+list);

    //Get Method
    System.out.println("Get Method By Index : "+list.get(2));    //10
    System.out.println("Get Method At First Index: "+list.getFirst());   //0
    System.out.println("Get Method At Last Index : "+list.getLast());   //999
    System.out.println("Peek Method : "+list.peek()); // return First Element of Linked List   - 0

    //Set Method
    list.set(2,11);  // Remove Indexed Present Elment Add Provided Element
    System.out.println("Linked List After Set Method : "+list);

    //Size Method
    System.out.println("Size Of Linked List : "+list.size());
    
    //Check Linked is Empty or Not
    if(list.isEmpty())
    {
        System.out.println("Linked List is Empty...!");
    }else{
        System.out.println("Linked List Is Not Empty...");
    }

    //remove Element Methods
    System.out.println("list.remove() : "+list.remove());  //by default remove First Element of Linked List
    System.out.println("list.removeFirst() : "+list.removeFirst());
    System.out.println("list.removeLast() : "+list.removeLast());
    System.out.println("list.remove(index : 2) : "+list.remove(2));

    
    //list.pop(); //this method are used to remove first element in linked list like stack

    System.out.println("Linked list After Remove Methods : "+list);
    System.out.println("Size of Linked List : "+list.size());
    }    
}
 
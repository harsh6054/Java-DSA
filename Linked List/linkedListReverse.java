// Leet Code Problem No 206. Reverse Linked List

public class linkedListReverse 
{
    public class Node 
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail =newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void reverse()
    {
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print()
    {
        if(head == null)
        {
            System.out.println("[]");
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print("["+temp.data+"] -> ");
            temp = temp.next;
        }
        System.out.println("[null]");
    }
    public static void main(String a[])
    {
        linkedListReverse l1 = new linkedListReverse();
        linkedListReverse l2 = new linkedListReverse();
        linkedListReverse l3 = new linkedListReverse();
        //list 1
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        //list 2
        l2.add(1);
        l2.add(2);
        System.out.println("_____________________________________________");
        l1.print();
        l1.reverse();
        l1.print();
        System.out.println("_____________________________________________");
        l2.print();
        l2.reverse();
        l2.print();
        System.out.println("_____________________________________________");
        l3.print();
        l3.reverse();
        l3.print();
        System.out.println("_____________________________________________");
    }
}

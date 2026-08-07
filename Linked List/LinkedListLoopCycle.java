public class LinkedListLoopCycle 
{
    public class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    } 

    public static Node head;
    public static int size;
    public static Node tail;

    //add Node
    public void add(int data)
    {
        Node newNode = new Node(data);
        size ++;

        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //remove cycle
    public void removeCycle()
    {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                cycle = true;
                break;
            }
        }
        if(cycle == false)
        {
            return;
        }

        slow = head;
        Node prev = null;
        while(slow != fast)
        {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;

    }

    //print Node
    public void printNode()
    {
        Node  temp = head;
        while(temp !=null)
        {
            System.out.print("["+temp.data+"] -> ");
            temp = temp.next;
        }
        System.out.println("[null]");

    }

    //print LinkedList With Loop Cycle
    public void printLimited(Node head, int limit) {
        Node temp = head;
        int count = 0;
    
        while (temp != null && count < limit) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }
        System.out.println("...");
    }
    
    public static void main(String a[])
    {
        LinkedListLoopCycle ll = new LinkedListLoopCycle();
        ll.add(3);
        ll.add(2);
        ll.add(0);
        ll.add(-4);
        Node temp = ll.head;
        Node cycleNode = ll.head.next;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = cycleNode;

        ll.printLimited(ll.head, 10);
        ll.removeCycle();
        ll.printNode();
    }  
}

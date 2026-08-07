// Sloution to Make Linked List in Zig-Zag Mode
public class ZigZagLinkedList 
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
    public static Node tail;
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printNode()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print("[ "+temp.data+" ] ->");
            temp = temp.next;
        }
        System.out.println("[ Null ]");
    }

    public void ZigZag()
    {
        // Find Mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //Reverse 2nd Half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextl,nextr;

        //Alternate Merge Zig-Zag 
        while(left != null && right != null)
        {
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;

            left = nextl;
            right = nextr;
        }
    }
    public static void main(String a[])
    {
        ZigZagLinkedList ll = new ZigZagLinkedList();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.printNode();

        ll.ZigZag();
        ll.printNode();

    }
}

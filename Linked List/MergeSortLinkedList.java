//Applied Merge Sort on Linked List - O(n log n)
public class MergeSortLinkedList 
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
    public static Node head;
    public static Node tail;
    public static int size;
    public void add(int data)
    {
        Node newNode = new Node(data);
        size++;

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
        System.out.println("[ null ]");
    }
    public  Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;
        
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    public Node getMid(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        
        while(head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public static void main(String a[])
    {
        MergeSortLinkedList ll = new MergeSortLinkedList();
        ll.add(20);
        ll.add(10);
        ll.add(21);
        ll.add(05);
        ll.add(11);
        ll.add(50);
        ll.add(98);
        ll.add(32);
        System.out.println("Before Sorting Linked List : ");
        ll.printNode();

        ll.head=ll.mergeSort(ll.head);
        ll.printNode();
    }    
}

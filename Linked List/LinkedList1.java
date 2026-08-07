public class LinkedList1 
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
    public static int size;

    public void addFirst(int data)
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

    public void addlast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp= temp.next;
        }
        temp.next = newNode;
    }

    public void add(int data, int idx)
    {
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head ;
        int i = 0;
        while(i< idx-1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("Linked List Is Empty ...");
            return Integer.MIN_VALUE;
        }else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("Linked List is Empty ...");
            return Integer.MIN_VALUE;
        }else if(size == 1)
        {
            int  val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        for(int i =0; i<size-2;i++)
        {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int search(int target)
    {
        Node temp = head;
        int i =0;
        while(temp != null)
        {
            if(temp.data == target)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
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

    //Remove nth Node from Last
    public void deleteNthNode(int n)
    {
        if(n == size)
        {
            head = head.next;
            return;
        }
        int i = 1;
        int toFind = size - n;
        Node prev = head;
        while(i < toFind)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public boolean checkPalindrome()
    {
        if(head == null || head.next == null)
        {
            return true;
        }
        //find mid logic
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node midNode = slow; //mid of linked list

        //make right part from mid reverse
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Check linked list are palindrome or Not
        Node right = prev;
        Node left = head;
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }


    public void printLinkedList()
    {
        Node  temp = head;
        while(temp !=null)
        {
            System.out.print("["+temp.data+"] -> ");
            temp = temp.next;
        }
        System.out.println("[null]");
    }
    public static void main(String a[])
    {
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addlast(100);
        ll.add(80, 2);
        ll.printLinkedList();
        // System.out.println("Size Of Linked List : "+ size);
        // System.out.println("Remove Element at Start of linked list : "+ll.removeFirst());
        // ll.printLinkedList();
        // System.out.println("Size Of Linked List : "+ size);
        // System.out.println("Remove Element at Start of linked list : "+ll.removeLast());
        // ll.printLinkedList();
        // System.out.println("Size Of Linked List : "+ size);
        // System.out.println("Find 80 in linked list : "+ll.search(80));
        // System.out.println("Find 12 in linked list : "+ll.search(12));
        // ll.reverse();
        // ll.printLinkedList();
        // ll.deleteNthNode(1);
        // ll.printLinkedList();
        System.out.println("Is Linked List Plaindrome or Not (t/f) : "+ ll.checkPalindrome());

    }    
}

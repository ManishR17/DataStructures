package Lists;

public class LinkedList {
   public class Node
   {
       int data;
       Node next;
   }
    Node head;
   Node tail;

    public void insert(int data)
    {
        if (isEmpty())
        {
            Node newnode = new Node();
            head = newnode;
            tail = newnode;
        } else
        {
            Node newnode = new Node();
            newnode.next = head;
            head = newnode;
        }
        System.out.print("-->"+data +" ");
    }
        public void remove(int data)
            {
                if(isEmpty())
                    return;
                else head = head.next;
                System.out.println();
                System.out.println("deleted:"+data);
            }
            public  boolean isEmpty()
    {
        return head==null;
    }

        public static void main(String[] args)
        {
            LinkedList ll=new LinkedList();
            ll.insert(10);
            ll.insert(20);

            ll.remove(20);

        }

}

package Lists;

public class LinkedList {
    public  class Node
   {
int data;
       Node next;
   }
    Node head;
   Node tail;
    public void insertFront( int data)
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
              System.out.print(data + "-->");
    }
        public void  removeFront( )
            {

                if(isEmpty()) {
                    return ;
                } else head = head.next;
                return;
            }
            public boolean isEmpty()
    {
        return head==null;
    }
        public static void main(String[] args)
        {
            LinkedList ll=new LinkedList();
            Node tail=null;
            ll.insertFront(10);
            ll.insertFront(20);
            ll.insertFront(30);
            ll.insertFront(40);
            System.out.print(tail);
              ll.removeFront();
        }

}

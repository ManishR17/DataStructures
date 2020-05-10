package Lists;

public class LinkedList {

   public  class Node
   {
int data;
       Node next;
   }
    Node head;
   Node tail;

    public void insert( int data)
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
        public void  remove( )
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
            ll.insert(10);
            ll.insert(20);
            ll.insert(30);
            ll.insert(40);
              ll.remove();
            


        }

}

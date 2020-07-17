package Lists;

public class List {
    static class node
    {
        node next;
        int data;

        public node(int data) {
            this.data = data;
        }
    }
        private node head;
        private node tail;
        int size=0;
         List()
        {
            this.head=null;
            this.tail=null;
        }
        public void push(int data)
        {
            size++;
            if(isEmpty())
            {
                node newnode=new node(data);
                head=newnode;
                tail=newnode;
            }else {
                node newnode = new node(data);
                newnode.next = head;
                head=newnode;
            }
            System.out.print(data);
        }
        public boolean isEmpty()
        {
             return head==null;
        }
    public static void main(String[] args)
    {
        List l=new List();
         l.push(10);
    }

}

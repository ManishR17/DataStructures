import java.util.*;
public class QueueList<T> {
    private Node head,tail;
    public class Node{
        T item;
        Node next;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void push(T item)
    {
        Node secondlast=tail;
        Node tail = new Node();
        tail.item=item;
        tail.next=null;
        if(isEmpty()) {
            head = tail;
        }
        else
            secondlast.next=tail;

    }
    public T pop()
    {
        T item=head.item;
        head=head.next;
        if(isEmpty())tail=null;
        return item;
    }
    public static  void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        QueueList<String> ql=new QueueList<>();

        String item=" ";
        while(!item.isEmpty())
        {

            item=scan.nextLine();
            scan.nextLine();
            if(item.equals("-"))
                System.out.println(ql.pop());
            else
                ql.push(item);

        }
    }
}

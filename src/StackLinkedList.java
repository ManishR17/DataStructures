import java.util.*;
public  class StackLinkedList<T> {
    private node head=null;
    public class node{
        T item;
        node next;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    public void push(T item) {

           node second = head;
        head = new node();
        head.item = item;
        head.next = second;
    }
    public T pop()
    {

        T item=head.item;
        head=head.next;
        return item;
    }
    public static void main(String[] args)
    {

        Scanner scan=new Scanner(System.in);




        StackLinkedList<String> sll=new StackLinkedList<>();

        String  item=" ";
        while(!item.isEmpty()) {
             item=scan.nextLine();
            if (item.equals("-"))
                System.out.println(sll.pop());
            else
                sll.push(item);



        }


    }
}

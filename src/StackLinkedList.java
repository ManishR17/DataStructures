import java.util.*;
public class StackLinkedList {
    private node head=null;
    public static class node{
        String item;
        node next;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    public void push(String item) {

           node second = head;
        head = new node();
        head.item = item;
        head.next = second;
    }
    public String pop()
    {

        String item=head.item;
        head=head.next;

       return item;

    }
    public static void main(String[] args)
    {

        Scanner scan=new Scanner(System.in);




        StackLinkedList sll=new StackLinkedList();

        String item=" ";
        while(!item.isEmpty()) {
             item=scan.nextLine();
            if (item.equals("-"))
                System.out.println(sll.pop());
            else
                sll.push(item);



        }


    }
}

import java.util.*;
public class AdjacencyLists {
    public static void main(String[] args)
    {
        List<Integer> l[];
        l=new LinkedList[10];
        for(int i=0;i<l.length;i++)
            l[i]=new LinkedList<>();
        l[0].add(02);l[0].add(03);
        l[1].add(12);l[1].add(13);
        l[3].add(22);l[3].add(23);
        l[5].add(32);l[0].add(33);
        l[9].add(42);l[9].add(43);

        for(int i=0;i<10;i++)
        {
            System.out.println(i+"-->"+l[i]);
        }
    }
}

package Seaching;
import java.util.*;
public class BinaryHeap {
    int size;
    int[] a;
    int maxsize;
    public BinaryHeap(int maxsize)
    {

        this.maxsize=maxsize;
        a=new int[this.maxsize+1];
        a[size]=Integer.MAX_VALUE;

    }
    public int parent(int N)
    {
        return N/2;
    }
    public int leftChild(int N)
    {
        return 2*N;
    }
    public int rightChild(int N)
    {
        return (2*N)+1;
    }
    public  void swap(int i, int j)
    {
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public void insert(int node)
    {
        a[++size]=node;
         int element=size;

        if(a[element]>a[parent(element)])
            swap(element,parent(element));
        element=parent(element);

    }

    public void printHeap()
    {
        int i;
        for(i=0;i<=size/2;i++)
            System.out.println("parent:"+a[i]+" left child:"+a[2*i]+" right child:"+a[(2*i)+1]);
        System.out.println();
    }

    public static void main(String[] args)
    {
        BinaryHeap bh=new BinaryHeap(10);

        bh.insert(11);
        bh.insert(20);
        bh.insert(8);
        bh.insert(15);
        bh.insert(25);
        bh.insert(30);
        bh.insert(13);
        bh.insert(5);
bh.printHeap();
    }


}

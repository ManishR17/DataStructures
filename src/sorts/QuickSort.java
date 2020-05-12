package sorts;

import java.util.Collections;

public class QuickSort {
    

    public static int partion(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {
            while (less(a[++i], a[lo])) {
                if (i == hi) {
                    break;
                }
            }

            while (less(a[lo], a[--j])) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) break;
                exchange(a, i, j);



        }
            exchange(a, lo, j);
            return j;



    }

    public static void sort(Comparable[] a)
    {

        //StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    public  static void sort(Comparable[] a,int lo,int hi)
    {

        if(hi<=lo)
            return;
        int j=partion(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);

    }
    public static void exchange(Comparable[] a,int i,int j)
    {
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }
    public static Boolean less(Comparable v,Comparable w)
    {
        return v.compareTo(w)<0;
    }
    public static void printArray(Comparable[] a)
    {
        for(Comparable j:a) {
            System.out.print(j);
        }System.out.println();
    }
    public static void main(String[] args)
    {
        QuickSort qs=new QuickSort();
        Comparable[] a={5,3,8,9,6,7,1};
        qs.sort(a,0,a.length-1);
        qs.printArray(a);
    }
}

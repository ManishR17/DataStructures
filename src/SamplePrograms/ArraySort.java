package SamplePrograms;
import java.util.*;
public class ArraySort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
           arr[i]=sc.nextInt();
        Arrays.sort(arr);
           for(int i=0;i<10;i++) {
               System.out.print(arr[i] + " ");
           }
    }

}
/****
******** Another method ********
 for(int i=0;i<10;i++)
 {
 for(int j=i;j>0;j--)
 {
 if(arr[j]<arr[j-1]) {
 temp = arr[j];
 arr[j] = arr[j-1];
 arr[j-1] = temp;
 }
 }
 }*/
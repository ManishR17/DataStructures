package Seaching;

public class BinarySearch {

    public static int search(int[] array, int key)
    {
        int low=0;
      int  high=array.length-1;

        while(low<=high)
        {
            int mid = (low + high) / 2;
            if (array[mid] == 0)
                return mid;
           else  if (array[mid] > key) {
                high=mid-1;

            }
            else if (array[mid] < key) {
                low=mid+1;

            }


        }
        return -1;

    }
    public static void main(String[] args)
    {
        BinarySearch bs=new BinarySearch();
      int array[]={1,5,3,4,7,8,9};
      int key=9;
int result=search(array,key);
System.out.println(result);
    }
}

public class SelectionSort {
     int i,min;
    public void sort(Comparable[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if (less(arr[j],arr[min])) {
                   min = j;
                }
            }
            exchange(arr, i, min);
        }

    }
    public static Boolean less(Comparable v,Comparable w)
    {
        return v.compareTo(w)<0;
    }
    public static void exchange(Comparable[] arr,int i,int j)
    {
        Comparable temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void printArray(Comparable[] arr)
    {
        for(Comparable i: arr) {
            System.out.println("sorted array:" + i + " ");
        }
        //System.out.println();

    }
    public static void main(String args[])
    {
        SelectionSort A=new SelectionSort();
        Comparable[] array={5,8,4,1,2};
        A.sort(array);
        A.printArray(array);
    }
}

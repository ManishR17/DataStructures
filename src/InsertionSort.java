public class InsertionSort {

    public void iSort(Comparable[] arr, int low, int high)
    {
        for(int i=low;i<high;i++)
        {
            printArray(arr);
            for(int j=i;j>low;j--)
            {
                if(less(arr[j],arr[j-1]))
                {
                    exchge(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) <0;
    }

    public void exchge(Comparable[] a,int i,int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }
    public static void printArray(Comparable[] a){
        for (Comparable i: a){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Comparable[] arr = {4,5,8,1,2,7,6,9,3,0};
        InsertionSort obj = new InsertionSort();
        obj.iSort(arr, 0, arr.length);
        obj.printArray(arr);
    }

}

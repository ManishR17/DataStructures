public class MergeSort {

    public static void merge(Comparable[] a,Comparable[] aux,int low,int mid,int high)
    {

        for(int k=low;k<=high;k++)
            aux[k]=a[k];
        int i=low,j=mid+1;
        for(int k=low;k<=high;k++)
        {
if(i>mid){
    a[k]=aux[j];
j++;}
else if(j>high){
    a[k]=aux[i];
    i++;}
else if(less(a[j],a[low])){
    a[k]=aux[j];
    j++;}
else{
    a[k]=aux[i];
i++;}

        }
    }
    public static void sort(Comparable[] a,Comparable[] aux,int low,int high){
            if(low<=high) {
                return;
            }
        else {
            int mid = (low + high)/ 2;
            sort(a, aux, low, mid);
            sort(a, aux, mid + 1, high);
            merge(a, aux,low, mid, high);
        }
    }
    public static void sort(Comparable[] a)
    {
        Comparable[] aux=new Comparable[a.length];
        sort(a,aux,0,a.length-1);
    }
    public static Boolean less(Comparable v,Comparable w)
    {
        return v.compareTo(w)<0;
    }
    public static void printArray(Comparable[] a)
    {
        for(Comparable i:a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        MergeSort obj=new MergeSort();
        Comparable[] arr={1,5,8,9,6,4,7,2,3,0};
        obj.sort(arr);
        obj.printArray(arr);

    }
}

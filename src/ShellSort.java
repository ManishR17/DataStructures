public class ShellSort{
    public void sSort(Comparable[] a)
    {
        int N=a.length;
        int h=1;
        while(h<N/3){
            h=h*3+1;
        }
        while(h>=1)
        {
            for(int i=h;i<N;i++)
            {
                for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h)
                {
                    exchange(a,j,j-h);
                }
            }
            h=h/3;
        }
    }
    public static Boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }
    public void exchange(Comparable[] a,int i,int j){
        Comparable swap=a[i];
        a[i]=a[j];
        a[j]=swap;
    }
    public static void printArray(Comparable[] a){
        for(Comparable i:a){
            System.out.print(i+" ");
    }
        System.out.println();
    }
    public static void main(String[] args){
        ShellSort obj=new ShellSort();
        Comparable[] arr={1,4,8,2,6,9,3};
        obj.sSort(arr);
        obj.printArray(arr);
    }
}
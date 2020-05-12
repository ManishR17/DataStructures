package SimplePrograms;

public class MaxArray {
    public static void main(String[] args)
    {
        int max=0;
        int array[]={1,5,6,7,8,9,4,2,3};
        int N=array.length;
        for(int i=0;i<N;i++)
        {
            if(array[i]>max)
                max=array[i];


        }
        System.out.print(max);

    }
}

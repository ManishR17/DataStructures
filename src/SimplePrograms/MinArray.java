package SimplePrograms;

public class MinArray {
    public static void main(String[] args)
    {

        int array[]={1,5,6,7,8,9,4,2,3,0};
        int min=array[0];
        int N=array.length;
        for(int i=0;i<N;i++)
        {
            if(array[i]<min)
                min=array[i];


        }
        System.out.print(min);

    }
}

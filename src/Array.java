import java.lang.*;

public class Array {
    int arr[]=new int[5];
    int top;



    public void push(int data){
        arr[top]=data;
        top++;
    }
    public int pop(){
        top--;
        int data;
        data=arr[top];
        arr[top]=0;
        return data;

    }
    public int peak(){
        int data;
        data=arr[top-1];
        return data;
    }
    public int size()
    {
        return top;

    }
    public boolean isEmpty()
    {
        return top<=0;
    }
    public void show()
    {
        for(int n:arr)
            System.out.println("Stack:" +n + " ");
    }
    public static void main(String args[]){
        Array arr1=new Array();
        arr1.push(10);
        arr1.push(20);
        arr1.push(30);
        System.out.println("POP value:" +arr1.pop());
        arr1.show();
        System.out.println("Peak Element:" +arr1.peak());
        System.out.println("is empty:"+arr1.isEmpty());
        System.out.println("Size:"+arr1.size());
    }
}
/* *****Dynamic array****
pushing elements beyond the limit and Shrinking the array.
create new array **int newarr=new int[size of existing array]
copy the existing array  **System.Arraycopy(arr,0,newarr,0,length);
replace newarray  **arr==newarr;

 */



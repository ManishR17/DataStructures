import java.util.*;
public class SumOfPairs
{
    static void print(int arr[],int sum)
    {

        HashSet<Integer> hs=new  HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            int temp=sum - arr[i];
            if(hs.contains(temp))
            {

                System.out.println(arr[i]+" "+temp);
            }
            else
                hs.add(arr[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length: ");
        int n=sc.nextInt();
        System.out.println("enter sum:");
        int sum=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr,sum);
    }
 }


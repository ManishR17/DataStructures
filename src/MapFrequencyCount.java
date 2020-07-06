import java.util.*;
public class MapFrequencyCount {
    static void printFreq(int arr[])
    {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            Integer c=mp.get(arr[i]);
            if(mp.get(arr[i])==null)
                mp.put(arr[i],1);
            else
                mp.put(arr[i],++c);
        }
        for(Map.Entry m:mp.entrySet())
        {
            System.out.println("frequency of "+m.getKey()+" is "+m.getValue());
        }
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        printFreq(arr);
    }
}

package Lists;

import java.util.Iterator;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args)
    {
        List<String> bikes = new ArrayList<String>( );
        {
        bikes.add("harley");
        bikes.add("ktm");
        bikes.add("jawa");
            Iterator<String> i = bikes.iterator();
        while(i.hasNext())
            {
                System.out.println(i.next());
            }
        }
    }
}

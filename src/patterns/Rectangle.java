package patterns;

public class Rectangle {
    public static void hallow( )
    {
        for(int i=1;i<=10;i++)
        {

            for(int j=1;j<=5;j++)
            {
                if(i==1 || i==10 || j==1 || j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }

    }
    public static void solid()
    {
        for(int i=1;i<=4;i++)
        {

            for(int j=1;j<=10;j++)
            {
               System.out.print("*"+" ");

            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        Rectangle obj=new Rectangle();
       obj.solid();
       System.out.println("----------------------------");
        obj.hallow();
    }
}
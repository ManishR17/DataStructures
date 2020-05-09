public class Recursion {
    static int fact(int n)
    {
        int x;
        if(n==1)
            return 1;
        else
            x=n*fact(n-1);
        return x;
    }
    public static void main(String[] args) {
        Recursion obj = new Recursion();
        int r = obj.fact(5);
        System.out.println(r);
    }
}

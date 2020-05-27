package Seaching;

import java.util.Scanner;
public class UnionFind {
    private int[] id;
    public UnionFind(int N)
    {
        id = new int[N];
        for(int i=0;i<N;i++)
            id[i]=i;
    }
    public boolean connected(int p,int q)
    {
        return id[p] == id[q];
    }
    public void union(int p,int q)
    {
        
        for(int i=0;i<id.length;i++)
            if(id[i]==id[p])
                id[i]=id[q];

    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        UnionFind uf=new UnionFind(N);
        while(N!=0) {
            int p = scan.nextInt();
            int q = scan.nextInt();

            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }
    }
}

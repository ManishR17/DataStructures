package Graphs;

import java.util.*;

public class Graph
{
    public class Edge
    {
       int v;
         int w;
        public Edge(int v,int w)
        {
          this.v=v;
          this.w=w;
        }

        @Override
        public String toString()
        {
            return "{"+v+","+w+"}";
        }

    }
    List<Edge> G[];
    public Graph(int N)
    {
         G=new LinkedList[N];
         for(int i=0;i<G.length;i++)
             G[i]=new LinkedList<Edge>();
    }
    boolean isConnected(int u,int v)
    {
        for(Edge i:G[u])
            if(i.v==v) return true;
            return false;
    }
    public void addEdge(int u,int v,int w)
    {
        G[u].add(0,new Edge(v,w));

    }
    @Override
    public String toString(){
        String result="";
        for(int i=0;i<G.length;i++)
            result+=i+"-->"+G[i]+"\n";
        return result;
    }
    public static void main(String[] args)
    {
        Graph g=new Graph(10);
        g.addEdge(0,2,10);
        g.addEdge(1,5,15);
       g.addEdge(7,12,5);
        g.addEdge(5,13,6);
        System.out.println(g);
        System.out.println(g.isConnected(1,5));


    }
}

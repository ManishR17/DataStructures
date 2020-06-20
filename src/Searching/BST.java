package Searching;

public class BST<Key extends Comparable<Key>,Val>
{

    private Node root;
     private  class Node
     {
         private Key key;
         private Val val;
         private Node left;
         private Node right;
         public Node(Key key,Val val)
         {
             this.key=key;
             this.val=val;
         }

     }
     public void put(Key key,Val val)
     {
      root=put(root,key,val);
     }
     private Node put(Node x,Key key,Val val)
     {
         if(x==null) return new Node(key,val);
         int cmp=key.compareTo(x.key);
        if(cmp<0)
             x.left=put(x.left,key,val);
        else if(cmp>0)
            x.right=put(x.right,key,val);
        else if(cmp==0)
            x.val=val;
        return x;
     }
     public Val get(Key key)
     {
         Node x=root;
         while(x!=null)
         {
             int cmp=key.compareTo(x.key);
             if(cmp<0)x= x.left;
             else if(cmp>0) x= x.right;
             else if(cmp==0) return x.val;
         }

         return null;

     }
     public static void main(String[] args)
     {
         BST<Integer,Integer> bst=new BST<>();
         bst.put(10,12);
         bst.put(20,7);
         bst.put(30,5);
         System.out.println(bst.get(30));

     }
}

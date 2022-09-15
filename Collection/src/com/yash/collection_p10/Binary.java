package com.yash.collection_p10;
public class Binary {
    public static Demo insert(Demo root, int data)
       {
           if (root == null)
               return new Demo(data);
           if (data < root.data)
               root.left = insert(root.left, data);
           if (data > root.data)
               root.right = insert(root.right, data);
           return root;
       }



     
       public static void inOrder(Demo root)
       {
           if (root == null)
               return;
           inOrder(root.left);
           System.out.print(root.data+" ");
           inOrder(root.right);
       }
}

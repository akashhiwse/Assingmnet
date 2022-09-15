package com.yash.collection_p10;

public class Demo2 {
	public static void main(String[] args) {
           int arr[] = { 1,4,3,3,4,6,7,8};
    
              int n = arr.length;
       
              Demo root = null;
              for (int i = 0; i < n; i++)
              {
                  root = Binary.insert(root,arr[i]);
              }
       
              Binary.inOrder(root);
          }
}
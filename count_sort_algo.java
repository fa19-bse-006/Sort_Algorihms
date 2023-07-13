/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.binary_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class count_sort_algo {
    
   static int getMax(int a[], int n) {  
        int max = a[0];  
        for(int i = 1; i<n; i++) {  
            if(a[i] > max){  
                max = a[i];  
            }
        }  
        return max; 
   }  
    static void count_Sort(int a[], int n){  
        int[] output=new int[n+1]; 
        int max = getMax(a, n);  
        int[] count=new int[max+1];  
        for (int i = 0; i <= max; ++i)   
        {  
            count[i] = 0; 
        }  
        for (int i = 0; i < n; i++) 
        {  
            count[a[i]]++;  
        }  
  
        for(int i = 1; i<=max; i++){   
            count[i] += count[i-1];
        }   
        for (int i = n - 1; i >= 0; i--) {  
            output[count[a[i]] - 1] = a[i];  
            count[a[i]]--; // decrease count for same numbers  
        }  
        for(int i = 0; i<n; i++) {  
            a[i] = output[i]; //store the sorted elements into main array  
        }  
    }  
    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        int n=arr.length;
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        count_Sort(arr,n);
        System.out.println("");
        System.out.print("Array after count sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}

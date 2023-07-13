/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bucket_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Bucket_Sort_algo {
    static int Max(int a[], int n) {  
        int max = a[0];  
        for(int i = 1; i<n; i++) {  
            if(a[i] > max)  
            max = a[i];  
        }  
    return max;  
    }  
    static void bucket_sort(int a[]){  
        int n = a.length;  
        int max = Max(a,n);  
        int bucket[] = new int[max+1];   
        for (int i = 0; i <= max; i++)  
        {  
            bucket[i] = 0;  
        }  
        for (int i = 0; i < n; i++)  
        {  
            bucket[a[i]]++;     
        }  
        for (int i = 0, j = 0; i <= max; i++)  
        {  
            while (bucket[i] > 0)  
            {  
                a[j++] = i;  
                bucket[i]--;  
            }  
        }
    }
    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        bucket_sort(arr);
        System.out.println("");
        System.out.print("Array after Bucket sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
}
}

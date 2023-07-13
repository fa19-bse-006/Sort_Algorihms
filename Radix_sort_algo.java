/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.radix_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Radix_sort_algo {
    static int Max(int a[], int n) {  
        int max = a[0];  
        for(int i = 1; i<n; i++) {  
            if(a[i] > max)  
            max = a[i];  
        }  
    return max;  
    }  
  
    static void count_Sort(int a[], int n, int place)
    {  
        int[] output = new int[n+1];  
        int[] count = new int[10];  
        for (int i = 0; i < n; i++){  
            count[(a[i] / place) % 10]++;  
        }  
        for (int i = 1; i < 10; i++){  
            count[i] += count[i - 1];
        }  
        for (int i = n - 1; i >= 0; i--) {  
            output[count[(a[i] / place) % 10] - 1] = a[i];  
            count[(a[i] / place) % 10]--;  
        }  
        for (int i = 0; i < n; i++){  
            a[i] = output[i];  }
    }  
    
    static void radix_sort(int a[], int n) {   
        int max = Max(a, n);   
        for (int place = 1; max / place > 0; place *= 10){  
            count_Sort(a, n, place);
        }
}
    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        int n=arr.length;
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        radix_sort(arr,n);
        System.out.println("");
        System.out.print("Array after radix sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}

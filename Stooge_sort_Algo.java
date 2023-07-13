/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stooge_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Stooge_sort_Algo {
    static void stooge_sort(int arr[], int l, int h)
    {
        if (l >= h)
            return;
        if (arr[l] > arr[h]) {
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
        }
        if (h - l + 1 > 2) {
            int t = (h - l + 1) / 3;
            stooge_sort(arr, l, h - t);
            stooge_sort(arr, l + t, h);
            stooge_sort(arr, l, h - t);
        }
    }
    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        int n=arr.length;
        stooge_sort(arr,0,n-1);
        System.out.println("");
        System.out.print("Array after stooge sort algorithm:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }    
    }
}

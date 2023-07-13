/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.merge_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Merge_sort_algo {
    public static void sort_array(int arr[], int l, int r){
        if (l < r) {
            int m = l + (r - l) / 2;
            sort_array(arr, l, m);
            sort_array(arr, m + 1, r);
            merge_array(arr, l, m, r);
        }
    }
    public static void merge_array(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Create temp arrays
        int Left[] = new int[n1];
        int Right[] = new int[n2];
 
        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            Left[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[]={6,4,5,1,8};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        sort_array(arr,0,arr.length-1);
        System.out.println("");
        System.out.print("Array after Heap sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
}
}

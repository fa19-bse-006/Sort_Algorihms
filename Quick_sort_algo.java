/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quick_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Quick_sort_algo {
    public static void swap(int[] arr,int j,int k) {
        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
     public static int Array_partition(int[] arr,int l,int h) {
        int pivot = arr[h];
        int i = (l - 1);
  
        for (int j = l; j <= h - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, h);
        return (i + 1);
    }
    public static void quick_Sort(int[] arr, int l,int h) {
        if(l<h){
            int partition=Array_partition(arr,l,h);
            quick_Sort(arr, l, partition - 1);
            quick_Sort(arr, partition + 1, h);
        }
         
    }

 
    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        int n=arr.length-1;
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        quick_Sort(arr,0,n);
        System.out.println("");
        System.out.print("Array after quick sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}

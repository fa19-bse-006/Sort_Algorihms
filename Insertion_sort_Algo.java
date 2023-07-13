/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.insertion_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Insertion_sort_Algo {
    public static void sort_Algo(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j;
            for(j=i-1;j >= 0 && arr[j] > key;j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
 

    public static void main(String[] args) {
        int arr[]={6,4,5,1,8};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        sort_Algo(arr);
        System.out.println("");
        System.out.print("Array after Insertion sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}

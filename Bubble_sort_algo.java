/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bubble_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Bubble_sort_algo {

    public static void main(String[] args) {
        int arr[]={6,4,5,1,8};
        int temp;
        int n=arr.length;
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }  
        System.out.println("");
        System.out.print("Array after Bubble sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}

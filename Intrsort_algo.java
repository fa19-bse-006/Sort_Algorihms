/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.intrsort_algo;

import java.util.Arrays;

/**
 *
 * @author Junaid Computers
 */
public class Intrsort_algo {
    private static final int THRESHOLD = 16;
    private static final int MAX_DEPTH = 2 * (int) Math.floor(Math.log(Integer.MAX_VALUE));
    
    public static void sort(int[] arr) {
        intro_sort(arr,0, arr.length - 1, MAX_DEPTH);
    }
    
    private static void intro_sort(int[] arr, int start, int end, int depthLimit) {
        int size = end - start + 1;
        
        if (size <=THRESHOLD) {
            insertion_Sort(arr, start, end);
        } else if (depthLimit == 0) {
            heap_Sort(arr, start, end);
        } else {
            int pivot = partition(arr, start, end);
            intro_sort(arr, start, pivot, depthLimit - 1);
            intro_sort(arr, pivot + 1, end, depthLimit - 1);
        }
    }
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start - 1;
        int j = end + 1;
        
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            
            do {
                j--;
            } while (arr[j] > pivot);
            
            if (i >= j) {
                return j;
            }
            swap(arr, i, j);
        }
    }
    private static void insertion_Sort(int[] arr, int start, int end) {
        for (int i = start + 1; i <= end; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= start && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = key;
        }
    }
    private static void heap_Sort(int[] arr, int start, int end) {
        Arrays.sort(arr, start, end + 1);
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {15,13,17,1,4,2};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        sort(arr);
        System.out.println("");
        System.out.print("Array after Strand sort: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }    
    }

}

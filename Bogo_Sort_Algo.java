/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bogo_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Bogo_Sort_Algo {
    static void bogo_sort(int[] a)
    {
        while (sort(a) == false)
            shuffle(a);
    }
    static void shuffle(int[] a)
    {
        for (int i = 1; i < a.length; i++)
            swap(a, i, (int)(Math.random() * i));
    }
    static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static boolean sort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }
    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        bogo_sort(arr);
        System.out.println("");
        System.out.print("Array after Bogo sort algorithm:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        
    }
    }
}

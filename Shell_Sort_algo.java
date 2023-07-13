/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.shell_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Shell_Sort_algo {
    static int shell_sort(int arr[])
    {
        int n = arr.length;
        for (int g = n/2; g > 0; g /= 2)
        {
            for (int i = g; i < n; i += 1)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= g && arr[j - g] > temp; j -= g){
                    arr[j] = arr[j - g];
                }
                arr[j] = temp;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        shell_sort(arr);
        System.out.println("");
        System.out.print("Array after shell sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
    }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.comb_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Comb_sort_algo {
    static int Next_Gap(int g)
    {
        g= (g*10)/13;
        if (g < 1)
            return 1;
        return g;
    }
    static void comb_sort(int arr[])
    {
        int n = arr.length;
        int g = n;
        boolean swape = true;
        while (g!= 1 || swape == true){
            g =Next_Gap(g);
            swape = false;
            for (int i=0; i<n-g; i++)
            {
                if (arr[i] > arr[i+g])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+g];
                    arr[i+g] = temp;
                    swape = true;
                }
            }
        }}
    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        comb_sort(arr);
        System.out.println("");
        System.out.print("Array after comb sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}

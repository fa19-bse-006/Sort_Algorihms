/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cycle_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Cycle_sort_algo {

    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        int n=arr.length;
        int count = 0;
        for (int cycle_s= 0; cycle_s <= n - 2; cycle_s++) {
            int item= arr[cycle_s];
            int p = cycle_s;
            for (int i = cycle_s + 1; i < n; i++){
                if (arr[i] < item)
                {
                    p++;
                }
            }
            if (p == cycle_s){
                continue;}
            while (item == arr[p]){
                p=p+1;
 
            }
            if (p != cycle_s) {
                int temp = item;
                item = arr[p];
                arr[p] = temp;
                count++;
            }
            while (p != cycle_s) {
                p = cycle_s;
                for (int i = cycle_s + 1; i < n; i++)
                    if (arr[i] < item)
                        p=p + 1;
                while (item == arr[p])
                {
                    p += 1;
                }
                if (item != arr[p]) {
                    int temp = item;
                    item = arr[p];
                    arr[p] = temp;
                    count++;
                }
            }
        }
        System.out.println("");
        System.out.print("Array after cycle sort Algorithm:  ");
        for(int a=0;a<arr.length;a++){
            System.out.print(" "+arr[a]);
        }   
    }
}

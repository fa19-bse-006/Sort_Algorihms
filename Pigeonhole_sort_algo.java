/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pigeonhole_sort_algo;

import java.util.Arrays;

/**
 *
 * @author Junaid Computers
 */
public class Pigeonhole_sort_algo {

    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        int n=arr.length;
        int min = arr[0];
        int max = arr[0];
        int range, j, k, index;
 
        for(int a=0; a<n; a++)
        {
            if(arr[a] > max)
                max = arr[a];
            if(arr[a] < min)
                min = arr[a];
        }
 
        range = max - min + 1;
        int[] pigeonhole = new int[range];
        Arrays.fill(pigeonhole, 0);
 
        for(j = 0; j<n; j++){
            pigeonhole[arr[j] - min]++;
        }
         
        index = 0;
 
        for(k = 0; k<range; k++){
            while(pigeonhole[k]-->0){
                arr[index++]=k+min;}
        }
        System.out.println("");
        System.out.print("Array after pigeonhole sort Algorithm:  ");
        for(int a=0;a<arr.length;a++){
            System.out.print(" "+arr[a]);
        }
    }
}

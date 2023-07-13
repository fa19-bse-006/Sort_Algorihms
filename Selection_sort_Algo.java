/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.selection_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Selection_sort_Algo {

    public static void main(String[] args) {
        int arr[]={6,4,5,1,8};
        int temp;
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        for(int i=0; i<arr.length;i++){
      
            for(int j=0;j>i;j--){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp; 
                }
            }
        //if(swape==false){
        //    break;
        //}
        }
        System.out.println("");
        System.out.print("Array after Selection sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        
    }
}

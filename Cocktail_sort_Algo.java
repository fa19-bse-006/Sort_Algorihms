/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cocktail_sort_algo;

/**
 *
 * @author Junaid Computers
 */
public class Cocktail_sort_Algo {

    public static void main(String[] args) {
        int arr[]={11,2,5,42,6};
        System.out.print("Array before sorting:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        boolean swap = true;
        int S = 0;
        int E = arr.length;
 
        while (swap== true)
        {
            swap = false;
            for (int i = S; i < E - 1; ++i)
            {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false){
                break;
            }
            swap = false;
            E= E - 1;
            for (int i = E - 1; i >= S; i--)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
            S = S + 1;
    }
        System.out.println("");
        System.out.print("Array after cocktail sort:  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}

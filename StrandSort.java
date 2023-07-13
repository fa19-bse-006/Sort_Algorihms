/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.strand_sort_algo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Junaid Computers
 */
public class StrandSort {
    
    public static void sort(int[] arr) {
        List<Integer> sorted = strandSort(toList(arr));
        if (sorted.size() != arr.length) {
            throw new IllegalStateException("List size does not match array length");
        }
        copyListToArray(sorted, arr);
    }
    
    private static List<Integer> strandSort(List<Integer> input) {
        if (input.size() <= 1) {
            return input;
        }
        List<Integer> sorted = new ArrayList<>();
        List<Integer> subsequence = new ArrayList<>();
        
        subsequence.add(input.remove(0));
        
        for (int i = 0; i < input.size()-1; i++) {
            int current = input.get(i);
            
            if (current >= subsequence.get(subsequence.size() - 1)) {
                subsequence.add(current);
            } else {
                sorted.addAll(subsequence);
                subsequence = new ArrayList<>();
                subsequence.add(current);
            }
        }
        sorted.addAll(subsequence);
        
        List<Integer> remaining = strandSort(input);
        sorted.addAll(merge(sorted, remaining));
        
        return sorted;
    }
    
    private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> merged = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while (i < list1.size()-1 && j < list2.size()-1) {
            if (list1.get(i) < list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }
        
        while (i < list1.size()-1) {
            merged.add(list1.get(i));
            i++;
        }
        
        while (j < list2.size()-1) {
            merged.add(list2.get(j));
            j++;
        }
        
        return merged;
    }
    
    private static List<Integer> toList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
    
    private static void copyListToArray(List<Integer> list, int[] arr) {
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {15,13,17,1,4,2};
        System.out.print("Array before sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        try {
            sort(arr);
            System.out.print("Array after Strand sort: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (IllegalStateException e) {
            System.out.println("Sorting failed: " + e.getMessage());
        }
    }
}

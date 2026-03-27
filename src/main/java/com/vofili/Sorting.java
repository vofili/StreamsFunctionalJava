package com.vofili;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {

    public int[] swap(int[] inarr,int pos1, int pos2){
        int temp = inarr[pos1];
        inarr[pos1] = inarr[pos2];
        inarr[pos2] = temp;

        return inarr;
    }
    public int[] bubbleSortAscending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is sorted
            if (!swapped) break;
        }
        return arr;
    }




    public static void main(String[] args) {
    //    Sorting s = new Sorting();
    //    System.out.println(s.doBubbleSort(new int[]{2,1,5,2,6,8,1}));
    }
}

package com.vofili;

public interface SortingAlgorithms {

    public int[] doBubbleAscending(int[] arr);
    public int[] doBubbleDescending(int[] arr);
    default int[] doSort(int[] arr){
        return arr;
    }
}

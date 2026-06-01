package com.vofili.algorithms_ex.arrays_strings;

import java.util.Arrays;

public class TwoPointers {
/* Two pointer technique simply uses 2 indexes to navigate along a collection like object in order to perform a data processing operation on it */



    //Reverse a string


    //Detect if a string is a palindrome
public static boolean detectIfPalindrome(String input){
    if(input == null ||input.length() ==0){ //improvement check if input is null or zero length
        return false;
    }
    //using two-pointers navigate from the beginning and from the end of the input string and detect if any two characters arent equal to each other
    boolean res = true;
    int startx = 0;
    int endx = input.length() - 1;
    while(startx < endx){
        if(input.toLowerCase().charAt(startx) != input.toLowerCase().charAt(endx)){
            res = false;
            return res;
        }
        startx++;
        endx--;
    }
    return res;
}

//return target using twoSum from a sorted integer array
public static Integer[] twoSumSorted(int[] input,int target){
        Integer[] ans = new Integer[2];

        int x = 0;
        int y = input.length - 1;
        while(x < y){
            if(input[x] + input[y] < target){
                x++;
            }
            if(input[x] + input[y] > target){
                y--;
            }
            if(input[x] + input[y] == target){
                ans[0]=input[x];
                ans[1]=input[y];
                break;
            }
        }
        return ans;
}



    public static void main(String[] args) {
       // System.out.println(detectIfPalindrome("Mallam"));

        int[] sortedHayStack = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int target= 9;

        System.out.println(Arrays.toString(twoSumSorted(sortedHayStack,target)));
    }
}

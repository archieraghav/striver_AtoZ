// Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place
// such that each unique element appears only once. The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates, then the first k elements of the array
// should hold the final result. It doesn't matter what you leave beyond the first k elements.

package step3;

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,3,4};
        duplicates(arr);
    }

    public static void duplicates(int [] arr){

        //using hashset
        HashSet<Integer> unique = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(!unique.contains(arr[i])){
                unique.add(arr[i]);
            }
        }
        System.out.println(unique);
    }
}

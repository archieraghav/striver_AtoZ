// Problem Statement: Given an array of size n, write a program to check
// if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
// If the array is sorted then return True, Else return False.

package step3;

public class isSorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,500,6};
        boolean flag = true;

        // brute force solution
        // for(int i = 0; i < arr.length - 1 ; i++){
        //     for(int j = i+1 ; j < arr.length; j++){
        //         if(arr[j] < arr[i]) flag = false;
        //     }
        // }

        //optimal solution
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] < arr[i-1]) flag = false;
        }

        if(flag) System.out.println("Yes sorted");
        else System.out.println("Not sorted");
    }
}

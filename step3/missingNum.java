// Given an array arr[] of size n-1 with distinct integers in the range of [1, n]. 
// This array represents a permutation of the integers from 1 to n with one element missing. 
// Find the missing element in the array.

// Examples: 

// Input: arr[] = [8, 2, 4, 5, 3, 7, 1] ==> {1,2,3,4,5,7,8}
// Output: 6

package step3;

public class missingNum {
    public static void main(String[] args) {
        int [] arr = {8,2,4,5,3,7,1};
        int n = arr.length + 1;
        solution(arr, n);

    }
    public static void solution(int [] arr, int n){

        int sum = 0;
        int expectedSum = n * (n+1)/2;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        int ans = expectedSum - sum;
        System.out.println(ans);
    }
}

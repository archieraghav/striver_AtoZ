// Problem Statement: Given an integer array nums, rotate the array to the left by one.

// Note: There is no need to return anything, just modify the given array.

package step3;

public class leftRotata {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;

        //shifting of elements
        // leftRotateByOne(arr);
        // display(arr);

        //with reversal algorithm
        reverse(arr, 0, 0);
        reverse(arr, 1, n - 1);
        reverse(arr, 0, n - 1);
        display(arr);
    }

    public static void reverse(int [] arr, int start, int end){
        // Reversal algorithm
        // steps :
            // 1.  Reverse first d elements
            // 2. Reverse remaining elements
            // 3. Reverse whole array

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static void leftRotateByOne(int [] arr){
        // without reversal algorithm
            // Store first element
            // Shift everything left
            // Put first element at the end

        int n = arr.length;

        //edge case
        if(n <= 1) return;

        int first = arr[0];

        for(int i = 1; i < n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = first;
    }

    public static void display(int [] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}

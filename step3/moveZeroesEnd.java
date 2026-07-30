// Problem Statement: You are given an array of integers, your task is to move all
// the zeros in the array to the end of the array and move non-negative integers to
// the front by maintaining their order.

// Examples
// Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
// Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

package step3;

public class moveZeroesEnd {
    public static void main(String[] args) {
        int [] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};

        int n = arr.length;
        zeroesEnd(arr, n);
        display(arr);

    }
    public static void zeroesEnd(int [] arr, int n){
        int i = 0;
        int j = n-1;

        while(i < j){
            if(arr[i]!= 0 && arr[j]!=0){
                i++;
            }
            else if(arr[i] == 0 && arr[j]!= 0){
                swap(arr, i, j);
                i++;
                j--;
            }
            else if(arr[i] != 0 && arr[j] == 0){
                j--;
            }
            else if(arr[i] == 0 && arr[j] == 0){
                i++;
                j--;
            }
        }
    }
    public static void display(int [] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

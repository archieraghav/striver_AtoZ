// Given an array, and an element num the task is to find if num is present in the given array or not. 
// If present print the index of the element or print -1.

// Input:
//  arr[] = 1 2 3 4 5, num = 3
// Output:
//  2

package step3;

public class linearSearch{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int num = 5;

        System.out.println(linearFunc(arr, num));
    }

    public static int linearFunc(int [] arr, int n){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}
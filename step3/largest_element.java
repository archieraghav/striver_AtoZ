// Given an array, we have to find the largest element in the array.
// Input:
//  arr[] = {2, 5, 1, 3, 0}
// Output:
//  5

package step3;

//import java.util.Arrays;

public class largest_element{
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,10};

        // brute force solution
        // Arrays.sort(arr);

        // System.out.println(arr[arr.length - 1]);



        //optimal solution
        int max = arr[0];

        for(int i = 1; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
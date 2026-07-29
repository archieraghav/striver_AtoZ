// Problem Statement: Given an array, find the second smallest and second largest element in the array.
// Print ‘-1’ in the event that either of them doesn’t exist.

// Examples
// Input:
//  [1, 2, 4, 7, 7, 5]
// Output:

// Second Smallest : 2
// Second Largest : 5

package step3;

public class second_largest {
    public static void main(String[] args) {
        int [] arr = {1,2,4,7,7,5};

        if(arr.length < 2){
            System.out.println(-1);
        }

        //second largest element
        else {
            int max = Integer.MIN_VALUE;
            int second_max = Integer.MIN_VALUE;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    second_max = max;
                    max = arr[i];
                } else if (arr[i] < max && arr[i] > second_max){
                    second_max = arr[i];
                }
            }

            System.out.println(second_max);

            //second smallest element
            int min = Integer.MAX_VALUE;
            int second_min = Integer.MAX_VALUE;

            for(int i = 0; i < arr.length ; i++){
                if(arr[i] < min){
                    second_min = min;
                    min = arr[i];
                } else if(arr[i] > min && arr[i] < second_min){
                    second_min = arr[i];
                }
            }

            System.out.println(second_min);
        }
    }
}

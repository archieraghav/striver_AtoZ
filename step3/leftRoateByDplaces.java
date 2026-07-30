// Input : nums = [1, 2, 3, 4, 5, 6, 7], k = 2, right
// Output : [6, 7, 1, 2, 3, 4, 5]

package step3;

public class leftRoateByDplaces {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 2;

        k = k%n;

         // Reversal algorithm
        // steps :
            // 1.  Reverse first d elements
            // 2. Reverse remaining elements
            // 3. Reverse whole array

        
        //LEFT ROTATE
        // reverse(arr, 0, k-1);
        // reverse(arr, k, n-1);
        // reverse(arr, 0, n-1);
        // display(arr);


        //RIGHT ROTATE
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
        display(arr);

    }
    public static void reverse(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void display(int [] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

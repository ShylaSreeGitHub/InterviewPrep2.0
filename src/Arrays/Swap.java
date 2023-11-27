package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,12,9,4};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            swap(arr, start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int max_val = Integer.MIN_VALUE;
        for(int i : arr){
            if (i > max_val){
                max_val = i;
            }
        }
        return max_val;
    }
}

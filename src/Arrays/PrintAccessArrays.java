package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintAccessArrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-----");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("------");
        for(int i : arr){
            System.out.println(i);
        }
    }
}

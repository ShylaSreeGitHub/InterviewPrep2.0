package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTwoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println("give input:");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println("----");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

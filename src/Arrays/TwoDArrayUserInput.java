package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][];
        for (int row = 0; row < arr.length; row++) {
            System.out.println("enter number of columns for each row"+(row + 1) +":");
            int columns = in.nextInt();
            arr[row] = new int[columns];

            for(int col = 0; col < arr[row].length ; col++){
                System.out.println("enter the input for each column in a row");
                arr[row][col] = in.nextInt();
            }
        }

        //print 2D
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println("---");
        for (int[] ar: arr){
            System.out.println(Arrays.toString(ar));
        }
    }
}

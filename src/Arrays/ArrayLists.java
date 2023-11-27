package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        System.out.println(list);
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr_list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr_list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3 ; i++) {
            System.out.println("enter input:");
            for (int j = 0; j < 3; j++) {
                arr_list.get(i).add(in.nextInt());
            }
        }
        System.out.println(arr_list);
    }
}

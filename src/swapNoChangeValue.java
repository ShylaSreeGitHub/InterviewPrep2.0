//primitive data types pass by value and objects are pass by the value of the reference

import java.util.Arrays;

public class swapNoChangeValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a +" "+ b);
        String name = "Kunal";
        changeName(name);
        System.out.println(name);

        int arr[] = {1,2,3,4};
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeArray(int[] nums){
        nums[0] = 0;
    }
    static void changeName(String naam){
        naam = "shyla";
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

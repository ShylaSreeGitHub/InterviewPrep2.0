import java.util.Scanner;

public class CountOccurrencesNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int digit = in.nextInt();
        // num = 431 and digit = 4
        int count = 0;
        while (num > 0){
            int rem = num%10;
            if (rem == digit){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}

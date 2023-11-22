import java.util.Scanner;

public class ReverseANum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // num = 23597
        int num = in.nextInt();
        int rev_num = 0;

        while (num > 0){
            int rem = num%10;
            rev_num = rev_num*10 + rem;
            num /= 10;
        }
        System.out.println(rev_num);
    }
}

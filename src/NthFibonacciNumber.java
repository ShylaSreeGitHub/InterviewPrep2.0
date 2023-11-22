import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter nth fibonacci number:");
        int n = scanner.nextInt();
        int count = 2;
        int a = 0;
        int b = 1;

        while (count <= n){
            int temp = b;
            b = a + b;
            a = temp;
            count++;
    }
        System.out.println(b);

    }
}

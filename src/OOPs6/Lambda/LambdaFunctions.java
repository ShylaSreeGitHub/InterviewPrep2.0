package OOPs6.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
                list.add(i);
        }
//        list.forEach(num -> System.out.println(num*2));

        Consumer<Integer> fun = num -> System.out.println(num*2);
        list.forEach(fun);

        Operation sum = Integer::sum;
        Operation sub = (a,b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a,b) -> a/b;

        LambdaFunctions calculator = new LambdaFunctions();
        System.out.println(calculator.operate(5,3,sum));
        System.out.println(calculator.operate(5,3,sub));
    }
    private int operate(int a, int b,  Operation op){
        return op.operation(a,b);
    }

}

interface Operation{
    int operation(int a, int b);
}

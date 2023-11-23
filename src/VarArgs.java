import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,"shyla","sree");
    }
    static void fun(int a, int b, String ...v){
        System.out.println(a+ " "+ b);
        System.out.println(Arrays.toString(v));
    }
}

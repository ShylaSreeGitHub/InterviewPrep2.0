package OOPs1;

public class WrapperIntSwap {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

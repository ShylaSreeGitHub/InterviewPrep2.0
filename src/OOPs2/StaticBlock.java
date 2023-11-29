package OOPs2;

public class StaticBlock {
    static int a = 4;
    static int b;
    static {
        System.out.println("I am static block!");
        b = a/2;
    }
    public static void main(String[] args) {
        // StaticBlock block = new StaticBlock();
        System.out.println(a + " "+ b);
        b = a*3;
        System.out.println(a + " "+b);
    }
}

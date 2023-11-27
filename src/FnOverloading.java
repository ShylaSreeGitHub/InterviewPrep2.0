//Overloading happens at compile time, Overriding happens at runtime.
//Overloading is having same fn name with either diff number of parameters or diff parameter type.
public class FnOverloading {
    public static void main(String[] args) {
        fun(4);
        fun("shyla");
    }
    static void fun(int a ){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println(a);
    }
}

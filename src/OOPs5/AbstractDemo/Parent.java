package OOPs5.AbstractDemo;

abstract public class Parent {
    static int age;
    final int VALVE;
    public Parent(int age) {
        Parent.age = age;
        VALVE = 1;
    }

    static void hello(){
        System.out.println("hey!");
    }

    void normal(){
        System.out.println("casual method!");
    }

    abstract void career();
    abstract void partner();
}

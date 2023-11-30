package OOPs3.Inheritance.Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint print = new ObjectPrint(24);
        ObjectPrint print1 = new ObjectPrint(34);
        System.out.println(print1);
    }
}

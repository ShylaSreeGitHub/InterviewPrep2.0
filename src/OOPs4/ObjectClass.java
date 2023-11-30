package OOPs4;

import OOPs2.A;

public class ObjectClass extends A{
    int num;

    public ObjectClass(int num) {
        super();
        this.num = num;
    }

    @Override
    public int hashCode() {
        return this.num;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectClass)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(24);
        System.out.println(obj.hashCode());

        ObjectClass obj2 = new ObjectClass(24);
        System.out.println(obj2.hashCode());

        if (obj == obj2){
            System.out.println("yes");
        }
        if (obj.equals(obj2)){
            System.out.println("yup");
        }
        System.out.println(obj2 instanceof Object);
        System.out.println(obj.getClass());

    }
}

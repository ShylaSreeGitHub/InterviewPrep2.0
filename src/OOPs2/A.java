package OOPs2;

public class A {
    String name;

    protected A(){
    }
    A(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "object created!";
    }
}

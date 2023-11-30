package OOPs5.AbstractDemo;

public class Main {
    public static void main(String[] args) {
//        Son son = new Son();
//        son.career();
//        son.partner();

        Daughter daughter = new Daughter(24);
        daughter.career();
        daughter.partner();

        Parent.hello();
        daughter.normal();
    }
}

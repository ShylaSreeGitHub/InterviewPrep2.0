package OOPs5.AbstractDemo;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to become coder");
    }

    @Override
    void partner() {
        System.out.println("I love to dadmom");
    }
}

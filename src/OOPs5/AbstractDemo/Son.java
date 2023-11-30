package OOPs5.AbstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }


    @Override
    void career() {
        System.out.println("I want to become a doctor " );
    }

    @Override
    void partner() {
        System.out.println("I love momdad");
    }
}

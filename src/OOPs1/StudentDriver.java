package OOPs1;

public class StudentDriver {
    public static void main(String[] args) {
        Students shyla = new Students();

        Students rahul = new Students("rahul",123,90.0f);

        shyla.greeting();
        System.out.println(rahul.rollNo);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);
        rahul.changeName("Sunil");
        System.out.println(rahul.name);

        Students random = new Students(shyla);
        System.out.println(random.name);
        System.out.println(random.marks);
        System.out.println(random.rollNo);

        Students obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new Students();
        }
    }
}

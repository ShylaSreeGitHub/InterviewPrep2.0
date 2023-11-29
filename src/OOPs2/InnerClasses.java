package OOPs2;

    class InnerTest{
        static String name;

        public InnerTest(String name) {
            this.name = name;
        }
    }

public class InnerClasses {
    public static void main(String[] args) {


        InnerTest test = new InnerTest("shyla");
        InnerTest test2 = new InnerTest("shyna");
        System.out.println(test.name);
        System.out.println(test2.name);
    }
}

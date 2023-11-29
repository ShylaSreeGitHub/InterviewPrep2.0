package OOPs2;

public class DriverProgram {
    public static void main(String[] args) {
//        A obj = new A("shyla");
//        System.out.println(obj);

        Human human1 = new Human(27,"shyla",20000,false);
        Human human2 = new Human(27,"ashu",15000,false);
        Human human3 = new Human(25,"shiva",12000,false);
        System.out.println(Human.population);
        DriverProgram main = new DriverProgram();
        main.greeting();
    }

    void greeting(){
        fun();
        System.out.println("Greeting!");
    }
    static void fun(){
        System.out.println("Have Fun!");
    }
}

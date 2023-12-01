package OOPs6.Cloning;

import OOPs2.A;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human(23,"kunal");
//        Human twin = new Human(human);
        Human twin = (Human)human.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(human.arr));
    }
}

package OOPs6.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(10,70);
        Student rahul = new Student(11,69);
        Student arpit = new Student(12,89);
        Student mohit = new Student(13,84);
        Student viren = new Student(14,80);

        Student[] students = {kunal,rahul,arpit,mohit,viren};
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(o1.marks - o2.marks);
            }
        });
        Arrays.sort(students, (o1, o2) -> -(o1.marks - o2.marks));
        System.out.println(Arrays.toString(students));

//        if(kunal.marks > rahul.marks){
//            System.out.println("kunal has more marks than rahul");
//        }
//        System.out.println(kunal.compareTo(rahul));
    }
}

package OOPs6.Comparing;

public class Student implements Comparable<Student>{
    int roll_no;
    int marks;

//    @Override
//    public int compareTo(Object o) {
////        return Math.max(this.marks, ((Student) o).marks);
//        return (this.marks  > ((Student)o).marks)? this.marks:((Student)o).marks;
//    }

//    @Override
//    public int compareTo(Student o) {
//        return (this.marks > o.marks)? this.marks:o.marks;
//    }


    @Override
    public int compareTo(Student o) {
        System.out.println("I am in compareTo method!");
        int diff = this.marks - o.marks;
        return diff;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", marks=" + marks +
                '}';
    }

    public Student(int roll_no, int marks) {
        this.roll_no = roll_no;
        this.marks = marks;

    }
}

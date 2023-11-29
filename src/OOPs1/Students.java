package OOPs1;

public class Students {
    int rollNo;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello I am "+name);
    }
    void changeName(String name){
        this.name = name;
    }
    Students(Students other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }
    Students(){
        this ("default person", 9,100.0f);
    }

    Students(String naam, int roll_no, float marks){
        this.name = naam;
        this.rollNo = roll_no;
        this.marks = marks;
    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("object is destroyed!");
//    }
}

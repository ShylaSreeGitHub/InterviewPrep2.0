package OOPs3.Inheritance.Polymorphism;

public class Shapes {
    void area(){
        System.out.println("Area of the shape");
    }
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.area();
        Shapes circle = new Circle();
        circle.area();
    }
}

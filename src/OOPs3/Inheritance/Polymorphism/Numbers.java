package OOPs3.Inheritance.Polymorphism;

public class Numbers {
        int sum(int a , int b){
            return a + b;
        }
        int sum(int a, int b, int c){
            return a + b + c;
        }

    public static void main(String[] args) {
        Numbers nums = new Numbers();
        nums.sum(2,3);
        nums.sum(1,2,3);
    }
}

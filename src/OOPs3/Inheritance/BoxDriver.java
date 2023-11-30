package OOPs3.Inheritance;

public class BoxDriver {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l +" "+ box.h+" "+box.w);
        BoxWeight weight = new BoxWeight();
        BoxWeight weight1 = new BoxWeight(1,2,3,4);
        System.out.println(weight.h+" "+weight.w+" "+weight.l+" "+weight.getWeight());

        Box box = new BoxWeight(2,3,4,5);
//        System.out.println(box.weight);//you cannot access weight because the reference type is Box.

//        BoxWeight boxWeight = new Box(1,2,3); you can't initialize weight in child because there is no weight in super
        //class constructor
        System.out.println("multilevel inheritance");
        BoxPrice boxPrice = new BoxPrice(2,3,4);
        System.out.println(boxPrice.cost+ " "+boxPrice.h+" "+boxPrice.getWeight()+" "+boxPrice.w+" "+boxPrice.l);
        Box box1 = new BoxWeight();
        box1.BoxPrint();
    }
}

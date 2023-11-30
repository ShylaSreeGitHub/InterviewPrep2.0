package OOPs5.AbstractDemo.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.start();
//        car.acc();
////        car.brake();
//        car.stop();
        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgrade(new ElectricEngine());
        car.start();
    }
}

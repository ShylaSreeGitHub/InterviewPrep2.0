package OOPs5.AbstractDemo.Interfaces;

public class DVDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("dvd player start");
    }

    @Override
    public void stop() {
        System.out.println("dvd player stop");
    }
}

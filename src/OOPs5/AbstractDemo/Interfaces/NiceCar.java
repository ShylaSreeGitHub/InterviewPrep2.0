package OOPs5.AbstractDemo.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new DVDPlayer();
    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgrade(Engine engine){
        this.engine = engine;
    }
}

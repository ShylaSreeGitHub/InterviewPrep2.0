package OOPs3.Inheritance;

public class BoxWeight extends Box{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public BoxWeight() {
        this.weight = -1;
    }
    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    public BoxWeight(int l, int h, int w, int weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(int side, int weight) {
        super(side);
        this.weight = weight;
    }
//    @Override
    static void BoxPrint(){
        System.out.println("I am in Box Weight Print, Greetings!");
    }
}

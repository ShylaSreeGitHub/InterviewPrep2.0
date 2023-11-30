package OOPs3.Inheritance;

public class BoxPrice extends BoxWeight {
    int cost;

    public BoxPrice(int cost) {
        super();
        this.cost = cost;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(int l, int h, int w, int weight, int cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(int side, int weight, int cost) {
        super(side, weight);
        this.cost = cost;
    }
}

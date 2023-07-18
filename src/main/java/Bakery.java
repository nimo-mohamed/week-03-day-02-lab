import java.util.ArrayList;
        import java.util.List;

public class Bakery {
    private List<Cake> cakes;

    public Bakery() {
        cakes = new ArrayList<>();
    }

    public void addCake(Cake cake) {
        cakes.add(cake);
    }

    public void removeCake(Cake cake) {
        cakes.remove(cake);
    }

    public List<Cake> getAllCakes() {
        return cakes;
    }
}

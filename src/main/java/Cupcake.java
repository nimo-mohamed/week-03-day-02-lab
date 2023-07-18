import java.util.ArrayList;

public class Cupcake extends Cake implements ICupcake {

    private String[] toppings;

    public Cupcake(String name, String baseFlavour, String[] toppings) {
        super(name, baseFlavour);
        this.toppings = toppings;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }
}


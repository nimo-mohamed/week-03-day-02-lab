public abstract class Cake {
    private String name;
    private String baseFlavour;

    public Cake(String name, String baseFlavour) {
        this.name = name;
        this.baseFlavour = baseFlavour;
    }

    public String getName() {
        return name;
    }

    public String getBaseFlavour() {
        return baseFlavour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }
}


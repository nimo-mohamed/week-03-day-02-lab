public class TrayBake extends Cake {
    private boolean healthier;

    public TrayBake(String name, String baseFlavour, boolean healthier) {
        super(name, baseFlavour);
        this.healthier = healthier;
    }

    public boolean getHealthier() {
        return healthier;
    }

    public void setHealthier(boolean healthier) {
        this.healthier = healthier;
    }
}


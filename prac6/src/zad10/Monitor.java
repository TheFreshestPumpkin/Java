package zad10;

public class Monitor {
    private String resolution;

    public Monitor(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "разрешение " + this.resolution;
    }
}

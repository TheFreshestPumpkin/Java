package t4;

public class Comp {

    private int model;
    private String cpu;
    private String card;
    private String mother;


    public Comp(int model,String cpu, String cart, String mother) {
        this.model=model;
        this.cpu = cpu;
        this.card = cart;
        this.mother = mother;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCart() {
        return card;
    }

    public void setCart(String cart) {
        this.card = cart;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Comp{" +
                "model=" + model +
                ", cpu='" + cpu + '\'' +
                ", cart='" + card + '\'' +
                ", mother='" + mother + '\'' +
                '}';
    }
}

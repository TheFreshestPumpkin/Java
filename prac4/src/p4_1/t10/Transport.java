package p4_1.t10;

public abstract class Transport {
    protected int pricePerPerson;
    protected int pricePerKG;
    protected int kilometerPerHour;

    public Transport() {}

    public Transport(int pricePerPerson, int pricePerKG, int kilometerPerHour) {
        this.pricePerPerson = pricePerPerson;
        this.pricePerKG = pricePerKG;
        this.kilometerPerHour = kilometerPerHour;
    }

    abstract int countPricePerPerson(int n);

    abstract int countPricePerKG(int n);

    abstract double countTime(int t);
}

package p4_1.t8;

public class Square extends Rectangle{
    protected double side;
    public Square() {}
    public Square(double side) { this.side = side; }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() { return side; }

    public void setSide(double side) { this.side = side; }

    @Override
    public void setWidth(double side) { this.side = side; }
    @Override
    public void setLength(double side) { this.side = side; }
    @Override
    public String toString() {
        return "Square: Area = " + this.getArea() + "; Perimeter = " + this.getPerimeter();
    }

}

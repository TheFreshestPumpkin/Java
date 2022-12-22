package t3;

public class Circle {
    private Point center=new Point();
    private double r;

    public Circle(double x, double y, double r) {
        this.center.setXY(x,y);
        this.r = r;
    }

    public String getCenter() {
        return center.toString();
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center.toString() +
                ", r=" + r +
                '}';
    }
}

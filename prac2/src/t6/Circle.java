package t6;
import java.lang.Math;
import t3.Point;

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

    public double length(){
        return (2*Math.PI*r);
    }

    public double square(){
        return (Math.PI*r*r);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center.toString() +
                ", r=" + r +
                '}';
    }
}

package p4_1.t8;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return this.color; }

    public void setColor(String color) { this.color = color; }

    public String isFilled() {
        if(this.filled){
            return "Заполненный";
        }
        else{
            return "Не заполненный";
        }
    }

    public void setFilled (boolean filled) { this.filled = filled; }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String toString();
}

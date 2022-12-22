package t2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1=new Ball();
        Ball b2=new Ball(154.27,-20.723);
        b1.setX(154.2);
        b1.setY(-20.723);
        System.out.println("Положение шариков до начала движения : ");
        System.out.println("Первый шарик - "+b1.getX()+" "+b1.getY());
        System.out.println("Второй шарик - "+b2.getX()+" "+b2.getY());
        b1.move(45.8,20.723);
        b2.move(-54.27,-0.277);
        System.out.println("Положение шариков после движения : ");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}

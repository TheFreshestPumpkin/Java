package t6;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите координаты центра круга");
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        System.out.println("Введите радиус окружности");
        double r=sc.nextDouble();
        if(r<=0){
            System.out.println("Введите значение радиуса большее нуля ");
            r=sc.nextDouble();
        }
        Circle circle=new Circle(x,y,r);
        System.out.println(circle.toString());
        System.out.println("Длина данной окружности - "+circle.length());
        System.out.println("Площадь данной окружности - "+circle.square());
    }
}

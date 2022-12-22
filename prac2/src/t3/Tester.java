package t3;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Введите количество кругов: ");
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        Circle[] c=new Circle[j];
        for(int i=0;i<j;i++){
            c[i]=new Circle(i,i-1,i+1);
            System.out.println(c[i].toString());
        }
    }
}

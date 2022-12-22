package t1;
import java.lang.*;
import java.util.Scanner;
//Рыбников Андрей Констанотинович
public class main {
    public static void main(String[] args) {
        Student s1=new Student("Николаев Павел Константинович","nickP@mail.ru",'m');
        s1.setEmail("PnickK@yandex.ru");
        System.out.println("Имя студента - "+s1.getName());
        System.out.println("Пол - "+s1.getGender());
        System.out.println("почтовый ящик - "+s1.getEmail());
        System.out.println();
        System.out.println(s1.toString());
    }
}

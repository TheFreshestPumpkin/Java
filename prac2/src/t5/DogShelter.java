package t5;
import java.util.Scanner;

public class DogShelter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите количество собак в питомнике:");
        int k= Integer.parseInt(sc.nextLine());
        Dog[] dogs=new Dog[k];
        for(int i=0;i<k;i++){
            System.out.println("Введите возраст и имя "+ (i+1)+" собаки");
            int age=Integer.parseInt(sc.nextLine());
            String name=sc.nextLine();
            dogs[i]=new Dog(name,age);
        }
        for(int i=0;i<k;i++){
            System.out.println(dogs[i].toString());
        }
    }
}

/*
14
Deyzi

4
Betty

1
Riki


* */

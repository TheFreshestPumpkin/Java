package t4;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите количество компьютеров в магазине:");
        int k= Integer.parseInt(sc.nextLine());
        Comp[] comps=new Comp[k];
        for(int i=0;i<k;i++){
            System.out.println("Введите номер модели, процессор, видеокарту, материнскую карту "+(i+1)+" компьютера");
            int mod=Integer.parseInt(sc.nextLine());
            String cpu=sc.nextLine();
            String card=sc.nextLine();
            String mother=sc.nextLine();
            comps[i]=new Comp(mod,cpu,card,mother);
        }
        int ch=1;
        while(ch!=0){
            System.out.println("Введите 1, чтобы найти компьютеры по процессору");
            System.out.println("Введите 2, чтобы найти компьютеры по Видеокарте");
            System.out.println("Введите 3, чтобы найти компьютеры по материнской карте");
            System.out.println("Введите 4, чтобы найти компьютер определённой модели");
            System.out.println("0-для выхода");
            ch=Integer.parseInt(sc.nextLine());
            switch (ch){
                case 1:
                    findByCpu(comps,k);
                    break;
                case 2:
                    findByCard(comps,k);
                    break;
                case 3:
                    findByMother(comps,k);
                    break;
                case 4:
                    findByModel(comps,k);
                    break;
                default:
                    System.out.println("Введено некорректное значение");
                    break;
            }
        }
    }

    public static void findByCpu(Comp[] comps, int k){
        System.out.print("Задайте процессор: ");
        Scanner sc=new Scanner(System.in);
        String cpu=sc.nextLine();
        System.out.println();
        System.out.println("Компьютеры с заданным процессором:");
        boolean fl=false;
        for(int i=0;i<k;i++){
            if (comps[i].getCpu().equals(cpu)){
                System.out.println(comps[i].toString());
                fl=true;
            }
        }
        if(fl){
            System.out.println("конец списка.");
        }
        else{
            System.out.println("Компьюеторов с заданной конфигурацей не найдено");
        }
    }

    public static void findByCard(Comp[] comps, int k){
        System.out.print("Задайте видеокарту: ");
        Scanner sc=new Scanner(System.in);
        String card=sc.nextLine();
        System.out.println();
        System.out.println("Компьютеры с заданной видеокартой:");
        boolean fl=false;
        for(int i=0;i<k;i++){
            if (comps[i].getCart().equals(card)){
                System.out.println(comps[i].toString());
                fl=true;
            }
        }
        if(fl){
            System.out.println("конец списка.");
        }
        else{
            System.out.println("Компьюеторов с заданной конфигурацей не найдено");
        }
    }

    public static void findByMother(Comp[] comps, int k){
        System.out.print("Задайте материнскую карту: ");
        Scanner sc=new Scanner(System.in);
        String mother=sc.nextLine();
        System.out.println();
        System.out.println("Компьютеры с заданным материнской картой:");
        boolean fl=false;
        for(int i=0;i<k;i++){
            if (comps[i].getMother().equals(mother)){
                System.out.println(comps[i].toString());
                fl=true;
            }
        }
        if(fl){
            System.out.println("конец списка.");
        }
        else{
            System.out.println("Компьюеторов с заданной конфигурацей не найдено");
        }
    }

    public static void findByModel(Comp[] comps, int k){
        System.out.print("Задайте модель: ");
        Scanner sc=new Scanner(System.in);
        int mod=sc.nextInt();
        System.out.println();
        System.out.println("Компьютер заданной модели:");
        boolean fl=false;
        for(int i=0;i<k;i++){
            if (comps[i].getModel()==mod){
                System.out.println(comps[i].toString());
                fl=true;
            }
        }
        if(fl){
            System.out.println("конец списка.");
        }
        else{
            System.out.println("Компьюеторов с заданной конфигурацей не найдено");
        }
    }
}

/*
2001
amd-fx-8300
nvidia-2070
m1

2002
amd-fx-8300
nvidia-1300
m2

2003
intel-core-i7
nvidia-2070
m3

2004
intel-core-i4
nvidia-2909
m2

2005
amd-fx-8300
nvidia-970
m1
*/

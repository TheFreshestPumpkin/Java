package p4_1.t10;
import java.util.Scanner;

public class Transports {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Transport auto = new Auto(2000, 1000, 90);
        Transport plain = new Plain(5000, 2500, 500);
        Transport train = new Train(700, 700, 70);
        Transport ship = new Ship(800, 300, 60);

        System.out.println("Введите количество пассажиров");
        int personsAmount = sc.nextInt();
        System.out.println("Введите вес груза в килограммах");
        int cargoWeight = sc.nextInt();
        System.out.println("Введите километраж пути");
        int kilometers = sc.nextInt();

        System.out.println("Автомобиль: Цена за пассажиров: " + auto.countPricePerPerson(personsAmount) +
                "; Цена за груз: " + auto.countPricePerKG(cargoWeight) +
                "; Время в пути: " + auto.countTime(kilometers));

        System.out.println("Самолет: Цена за пассажиров: " + plain.countPricePerPerson(personsAmount) +
                "; Цена за груз: " + plain.countPricePerKG(cargoWeight) +
                "; Время в пути: " + plain.countTime(kilometers));

        System.out.println("Поезд: Цена за пассажиров: " + train.countPricePerPerson(personsAmount) +
                "; Цена за груз: " + train.countPricePerKG(cargoWeight) +
                "; Время в пути: " + train.countTime(kilometers));

        System.out.println("Корабль: Цена за пассажиров: " + ship.countPricePerPerson(personsAmount) +
                "; Цена за груз: " + ship.countPricePerKG(cargoWeight) +
                "; Время в пути: " + ship.countTime(kilometers));
    }
}

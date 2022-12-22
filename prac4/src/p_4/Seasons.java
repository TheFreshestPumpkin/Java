package p_4;

import java.util.Scanner;

public class Seasons {
    public enum Years {
        Summer(30, "Самое жаркое время года"),
        Autumn(15, "Дожди, листопады и прохлада"),
        Winter(-10, "Мороз, Новый Год и снег"),
        Spring(5, "Снег тает, цветы расцветают");

        private int averageTemp;
        private String description;

        Years(int temp, String desc) {
            this.averageTemp = temp;
            this.description = desc;
        }

        public int getAverageTemp() {
            return averageTemp;
        }

        public String getDescription() {
            return description;
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String favSeason;
        System.out.print("Введите любимое время года\n");
        favSeason = sc.next();
        Years time = Years.valueOf(favSeason);
        switch (time) {
            case Summer -> System.out.println("Я люблю Лето!");
            case Autumn -> System.out.println("Я люблю Осень!");
            case Winter -> System.out.println("Я люблю Зиму!");
            case Spring -> System.out.println("Я люблю Весну!");
        }

        System.out.println("Все времена года: \n");
        for (Years times : time.values()){
            System.out.println(times + "; Temperature = " + times.getAverageTemp() + "; " + times.getDescription());
        }

    }
}

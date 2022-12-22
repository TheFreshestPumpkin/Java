package math;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class t4 {
    public t4() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        while(n <= 0) {
            System.out.println("Введите число n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Введите число больше нуля ");
            }
        }

        for(int i = 0; i < n; ++i) {
            numbers.add((int)(Math.random() * (double)n));
        }

        System.out.println("Сгеннерированный массив: ");
        numbers.forEach((numx) -> {
            System.out.print("" + numx + " ");
        });
        ArrayList<Integer> even_numbers = new ArrayList();
        Iterator var5 = numbers.iterator();

        while(var5.hasNext()) {
            int num = (Integer)var5.next();
            if (num % 2 == 0) {
                even_numbers.add(num);
            }
        }

        System.out.println("\nТолько четные элементы массива: ");
        even_numbers.forEach((numx) -> {
            System.out.print("" + numx + " ");
        });
    }
}
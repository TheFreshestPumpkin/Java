package pr1;

import java.util.Scanner;

public class t4 {
    public t4() {
    }
    public static int findMax(int[] arr) {
        int max = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; ++i) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            data[i] = sc.nextInt();
            sum += data[i];
        }

        System.out.print("Сумма: " + sum);
        System.out.println();
        System.out.print("Максимальный элемент: " + findMax(data));
        System.out.println();
        System.out.print("Минимальный элемент: " + findMin(data));
    }
}

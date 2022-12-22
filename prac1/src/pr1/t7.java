package pr1;

import java.util.Scanner;

public class t7 {
    public static int f(int j){
        int k=1;
        for(int i=1;i<=j;i++){
            k*=i;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        System.out.print("Факториал: " + f(n));
    }
}

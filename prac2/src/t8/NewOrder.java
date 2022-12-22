package t8;
import java.util.Scanner;


public class NewOrder {
    public static void main(String[] args) {
        String[] sentac;
        System.out.println("Введите количесвто элементов массива - ");
        Scanner sc=new Scanner(System.in);
        int k=Integer.parseInt(sc.nextLine());
        sentac=new String[k];
        for(int i=0;i<k;i++){
            sentac[i]= sc.nextLine();
        }
        for(int i=0;i<k/2;i++){
            String temp=sentac[i];
            sentac[i]=sentac[k-i-1];
            sentac[k-i-1]=temp;
        }
        for(int i=0;i<k;i++){
            System.out.println(sentac[i]);
        }
    }
}

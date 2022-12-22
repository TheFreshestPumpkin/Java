import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class poker {
    public static void main(String[] args) {
        String[] suit={"♥","♦","♠","♣"};
        String[] cards={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] deck=new String[52];
        int d=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                deck[d]=cards[j]+suit[i];
                d++;
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 52; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("сколько игроков?");
        int n = sc.nextInt();
        int k = 0;
        if (n <= 10) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(deck[list.get(k++)]);
                }
                System.out.println("|------------|");
            }
        }
        else{
            System.out.println("Вы не можете таким количество людей поиграть в покер(");
        }
    }
}

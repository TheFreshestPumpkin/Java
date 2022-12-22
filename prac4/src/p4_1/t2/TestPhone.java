package p4_1.t2;

import java.util.Scanner;

public class TestPhone {
    public TestPhone(){
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phone=new Phone[3];
        phone[0]=new Phone();
        phone[1]=new Phone();
        phone[2]=new Phone();
        for(int i=0;i<3;i++){
            System.out.println("Введите модель, номер (и вес) телефона");
            String mod = sc.nextLine();
            long number = Integer.parseInt(sc.nextLine());
            int weight = Integer.parseInt(sc.nextLine());
            phone[i]=new Phone(number,mod,weight);
        }

        phone[0].receiveCall("Олег");
        phone[1].receiveCall("Марк", 89123245);
        phone[2].sendMessage(23571117,1357911,9876543,246810);
        phone[0].sendMessage(1245780);
    }
}

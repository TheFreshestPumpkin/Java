package p4_1.t2;

public class Phone {
    private long number;
    private String model;
    private int weight;

    public Phone() {
        this.weight = 0;
    }

    public Phone(long num, String mod) {
        this.weight = 0;
        this.number = (long)num;
        this.model = mod;
    }

    public Phone(long num, String mod, int weight) {
        this(num, mod);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("На номер "+ this.number + " Звонит " + name);
    }

    public void receiveCall(String name, long num) {
        System.out.println("На номер "+this.number+ " Звонит " + name + " с номера " + num);
    }

    public long getNumber() {
        return this.number;
    }

    public void sendMessage(int... numbers) {
        int[] var2 = numbers;
        int var3 = numbers.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            System.out.println("Сообщение отпралвено на номер " + num);
        }

    }

    public String toString() {
        return this.model + " " + this.number + " " + this.weight;
    }
}

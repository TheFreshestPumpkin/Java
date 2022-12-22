package pr1;

import java.util.Scanner;

public class t5 {
    public t5() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        String[] var2 = args;
        int var3 = args.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String arg = var2[var4];
            System.out.print(arg);
            System.out.print(" ");
        }

    }
}
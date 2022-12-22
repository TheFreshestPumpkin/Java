package math;

import java.util.ArrayList;

public class t3 {
    public t3() {
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();

        for(int i = 0; i < 4; ++i) {
            numbers.add(10 + (int)(Math.random() * 89.0));
        }

        numbers.forEach((num) -> {
            System.out.print("" + num + " ");
        });
        boolean flag = true;

        for(int i = 1; i < numbers.size(); ++i) {
            if ((Integer)numbers.get(i) <= (Integer)numbers.get(i - 1)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("\nМассив является строго возрастающей последовательностью");
        } else {
            System.out.println("\nМассив не является строго возрастающей последовательностью");
        }

    }
}

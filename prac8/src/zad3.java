public class zad3 {

    public static String recursion(int a, int b) {
        if (a == b){
            return Integer.toString(a);
        }
        else if (a > b) {
            return a + " " + recursion(a - 1, b);
        } else {
            return a + " " + recursion(a + 1, b);
        }

    }
    public static void main(String[] args) {
        System.out.println(recursion(20, 10));
        System.out.println(recursion(10, 20));
    }

}

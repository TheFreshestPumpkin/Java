public class zad2 {

    public static void main(String[] args) {
        System.out.println(recursion(12)); // вызов рекурсивной функции
    }

    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }

}

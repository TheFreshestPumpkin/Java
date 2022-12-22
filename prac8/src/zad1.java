public class zad1{

    public static void main(String[] args) {
        recursion(10,1,1); // вызов рекурсивной функции
    }

    public static void recursion(int n,int k,int count) {
        if (n == 0)
            return;
        if (count == 0) {
            k++;
            count = k;
        }
        System.out.println(k+" ");
        recursion(n-1, k, count-1);
    }
}


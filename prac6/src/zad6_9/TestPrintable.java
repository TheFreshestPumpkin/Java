package zad6_9;

import java.util.ArrayList;

public class TestPrintable {
    public static void main(String[] args) {
        ArrayList<Printable> arr = new ArrayList<>();
        arr.add(new Book("Hobbit", "Tolkien"));
        arr.add(new Book("Lord of Rings", "Tolkien"));
        arr.add(new Shop("H&M", "clothes"));
        arr.add(new Shop("Perekrestok", "food"));
        for (Printable obj : arr) { obj.print(); }
    }
}

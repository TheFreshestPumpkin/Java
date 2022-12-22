package t7;
import java.util.Scanner;

public class BooksTest {
    public static void main(String[] args) {
        System.out.println("Какой количесвто книг на полке?");
        Scanner sc=new Scanner(System.in);
        int k=Integer.parseInt(sc.nextLine());
        Book_shelf shelf=new Book_shelf(k);
        for(int i=0;i<k;i++){
            System.out.println("Введите год, автора и название "+(i+1)+" книги ");
            int year=Integer.parseInt(sc.nextLine());
            String auther= sc.nextLine();
            String name= sc.nextLine();
            Book b=new Book(year,auther,name);
            shelf.setBooks(b,i);
        }
        System.out.println(shelf.min_max());
        shelf.sortirovka();
        shelf.toStrings();
    }
}
/*
1200
unknown
Chikchi

1916
V.I.Lenin
Imperializm

2005
S.Meyer
Twilight

 */

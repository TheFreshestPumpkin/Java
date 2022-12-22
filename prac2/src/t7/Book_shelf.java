package t7;

import java.util.Arrays;
import java.util.Scanner;
public class Book_shelf {
    private Book[]books;
    private int k;

    public Book_shelf(int k) {
        this.k = k;
        books=new Book[k];
    }

    public Book getBooks(int i) {
        return books[i];
    }

    public void setBooks(Book book,int i) {
        this.books[i] = book;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void toStrings() {
        for(int i=0;i<k;i++){
            System.out.println(books[i].toString());
        }
    }

    public String min_max(){
        int mi=2023;
        Book old = null,young = null;
        int ma=-1227;
        for(int i=0;i<k;i++){
            if(books[i].getYear()<mi){
                mi=books[i].getYear();
                old=books[i];
            }
            if(books[i].getYear()>ma){
                ma=books[i].getYear();
                young=books[i];
            }
        }
        return "Самая старая книга на полке - "+ old.toString()+'\'' +
                "Cамая новая книга - " + young.toString();
    }

    public void sortirovka(){
        for(int i=0;i<k;i++){
            for(int j=0;j<k-1;j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book tmp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = tmp;
                }
            }
        }
    }
}

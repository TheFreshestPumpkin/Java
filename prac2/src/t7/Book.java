package t7;

public class Book {
    private int year;
    private String auther;
    private String name;

    public Book(int year, String auther, String name) {
        this.year = year;
        this.auther = auther;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", auther='" + auther + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

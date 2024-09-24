public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(Author author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return this.author + ", \"" + this.title + "\", " + this.year;
    }
}

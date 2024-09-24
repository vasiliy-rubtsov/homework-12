public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        // Создаем авторов
        Author author1 = new Author("Иван", "Тургенев");
        Author author2 = new Author("Лев", "Толстой");

        // Создаем книги
        books[0] = new Book(author1, "Отцы и дети", 1987);
        books[1] = new Book(author2, "Анна Каренина", 1981);
        books[2] = new Book(author1, "Записки охотника", 1981);

        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("-----");

        books[1].setYear(1998);
        System.out.println(books[1]);
    }
}
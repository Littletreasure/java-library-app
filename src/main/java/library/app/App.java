package library.app;

import java.util.ArrayList;

public class App {
    public BookList bookList;

    public App() {
        bookList = new BookList();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Integer getBookCount() {
        return bookList.getCount();
    }

    public Book getBook(String title) {
        return bookList.getBook(title);
    }

    public ArrayList<Book> getBooks(String author) {
        return bookList.getBooksByAuthor(author);
    }

    public static void main(String[] args) {
        App app = new App();
    }
}

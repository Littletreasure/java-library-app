package library.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookList {
    ArrayList<Book> inventory = new ArrayList<>();

    public Integer getCount() {
        return inventory.size();
    }

    public void add(Book book) {
        inventory.add(book);
    }

    public Book getBook(String title) {
        Book foundBook = inventory.stream()
                .filter(book -> book.getTitle() == title)
                .findAny()
                .orElse(null);

        return foundBook;
    }

    public ArrayList<Book> getBooksByAuthor(String author) {
        List<Book> foundBooks = inventory.stream()
                .filter(book -> book.getAuthor() == author)
                .collect(Collectors.toList());

        return new ArrayList<Book>(foundBooks);
    }
}

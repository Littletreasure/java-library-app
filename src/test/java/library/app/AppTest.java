package library.app;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {
    private static final Book book1 = new Book("Great Expectations", "Charles Dickens");
    private static final Book book2 = new Book("Pride and Prejudice", "Jane Austen");
    private static final Book book3 = new Book("Oliver Twist", "Charles Dickens");

    @Test
    public void addBookToInventory() {
        App classUnderTest = new App();
        classUnderTest.addBook(book1);
        assert(classUnderTest.getBookCount() == 1);
    }

    @Test
    public void getBook() {
        App classUnderTest = new App();
        classUnderTest.addBook(book1);
        assert(classUnderTest.getBook("Great Expectations").getTitle() == "Great Expectations");
    }

    @Test
    public void getBookByTitle() {
        App classUnderTest = new App();
        classUnderTest.addBook(book1);
        classUnderTest.addBook(book2);
        assert(classUnderTest.getBook("Great Expectations").getTitle() == "Great Expectations");
    }

    @Test
    public void getBooksByAuthor() {
        App classUnderTest = new App();
        classUnderTest.addBook(book1);
        classUnderTest.addBook(book2);
        classUnderTest.addBook(book3);
        ArrayList<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book3);

        assertEquals(classUnderTest.getBooks("Charles Dickens"), expected);
    }
}

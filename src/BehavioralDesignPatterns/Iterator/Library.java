package BehavioralDesignPatterns.Iterator;
import java.util.List;
import java.util.ArrayList;
class Library implements BookCollection {
    private List<Book> books;

    Library() {
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    @Override
    public LibraryIterator createIterator() {
        return new LibraryIterator(books);
    }
}
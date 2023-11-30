package BehavioralDesignPatterns.Iterator;
import java.util.List;
class LibraryIterator implements Iterator<Book> {
    private List<Book> books;
    private int index;

    LibraryIterator(List<Book> books) {
        this.books = books;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        return books.get(index++);
    }
}
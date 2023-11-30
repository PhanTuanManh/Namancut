package BehavioralDesignPatterns.Iterator;

public class IteratorClient {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software"));
        library.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship"));
        library.addBook(new Book("The Pragmatic Programmer: Your Journey to Mastery"));

        Iterator<Book> iterator = library.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book Title: " + book.getTitle());
        }
    }
}
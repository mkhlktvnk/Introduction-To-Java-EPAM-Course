import java.util.ArrayList;
import java.util.List;

public class BookService {
    private final List<Book> books = new ArrayList<>();

    public void addNewBook(Book book) {
        books.add(book);
    }

    public List<Book> findBooksOfAuthor(String author) {
        return books.stream().filter((book -> book.getAuthors().contains(author))).toList();
    }

    public List<Book> findBooksOfPublishingHouse(String publishingHouse) {
        return books.stream().filter(book -> book.getPublishingHouse().compareTo(publishingHouse) == 0).toList();
    }

    public List<Book> findBooksPublishedAfterGivenYear(int year) {
        return books.stream().filter(book -> book.getYearOfPublishing() > year).toList();
    }
}

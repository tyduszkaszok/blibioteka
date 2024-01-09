import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Date;

public class Library {

    private double penalty = 0.2;
    private String name;

    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Reader> readers = new  ArrayList<Reader>();
    private ArrayList<Rental> rentals = new  ArrayList<Rental>();
    private BigDecimal delayFee;

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book)
    {
        books.add(book);
    }

    public void deleteBook(Book book)
    {
        books.remove(book);
    }

    public void addReader(Reader reader)
    {
        readers.add(reader);
    }

    public void addRental(Rental rental)
    {
        rentals.add(rental);
    }

    public void report()
    {
        for(int i=0; i<books.size(); i++)
        {
            System.out.println(books.get(i).toString());
        }
    }

    public boolean isBookRented(String isbn) {
        return books.stream().anyMatch(b -> b.getIsbn().equals(isbn) && b.getRented()); // wyszukiwanie po isbn i tylko wypożyczonej
    }

    public boolean isBookRented(Book book) {
        return isBookRented(book.getIsbn());
    }

    public List<Book> findByAuthor(String author) {
        return books.stream().filter(b -> b.getAuthor().equals(author)).collect(Collectors.toList());
    }
    public List<Book> findByTitle(String title) {
        return books.stream().filter(b -> b.getTitle().equals(title)).collect(Collectors.toList());
    }

    public List<Book> findByIsbn(String isbn) {
        return books.stream().filter(b -> b.getIsbn().equals(isbn)).collect(Collectors.toList());
    }

    public List<Book> findByYear(int year) {
        return books.stream().filter(b -> b.getYear()==year).collect(Collectors.toList());
    }

    public List<Book> findByGenre(String genre) {
        return books.stream().filter(b -> b.getGenre().equals(genre)).collect(Collectors.toList());
    }

    public void endOfDay(Date currentDate)
    {
        for (int i = 0; i < rentals.size(); i++)
        {
            if(rentals.get(i).getReturnDate().compareTo(currentDate) < 0 && !rentals.get(i).isReturned())
            {
                rentals.get(i).addDelay();
                rentals.get(i).getReader().increasePenalty(getPenalty());
            }
        }

    }

    public double getPenalty()
    {return penalty;}

    public void newPenalty(double penalty)
    {
        this.penalty = penalty;
    }
}

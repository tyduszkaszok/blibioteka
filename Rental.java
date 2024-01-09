import java.util.Date;

public class Rental {
    private Long id;
    private Book rentedBook;
    private Reader reader;
    private Date rentDate;
    private Date estimatedReturnDate;
    private Date returnDate;
    private int delayInDays = 0;

    public Rental(Book book, Reader reader, Date estimatedReturnDate) {
        this.id = 0L;
        this.rentedBook = book;
        rentedBook.isRented(true);
        this.reader = reader;
        this.rentDate = new Date();
        this.estimatedReturnDate = estimatedReturnDate;
    }

    void returnBook() {
        this.returnDate = new Date();
        this.rentedBook.isRented(false);
    }

    /**
     * Dodaj funkcjonalność opóźnień w zwrotach ksiązek...
     * To ja bym to zrobił tak, że w Library masz jakąs tam kare za dzień opóźnienia
     * w Mainie robisz metode np. koniec dnia, która dla każdego wypożyczenia sprawdza czy książka jest oddana (isReturned)
     * a jeśli nie jest to sprawdzał czy data nowego dnia jest już za szacowana dnia oddania (estimatedReturnDate)
     * i jeśli jest po terminie to naliczał grzywnę na czytelnika
     */
    void addDelay()
    {
        this.delayInDays++;
    }

    public boolean isReturned() {
        return returnDate != null;
    }

    public Date getReturnDate()
    {return estimatedReturnDate;}

    public Reader getReader()
    {return this.reader;}
}

public class Rental {
    private String author;
    private String title;
    private String isbn;
    private String name;
    private String surname;
    private String id;

    private String rentDate;
    private String returnDate;

    private String delay;

    public Rental(Book book, Reader reader, String rentDate, String returnDate) {
        this.author = book.getAuthor();
        this.title = book.getTitle();
        this.isbn = book.getIsbn();
        this.name = reader.getName();
        this.surname = reader.getSurname();
        this.id = reader.getId();
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        book.isRented(true);
    }

    void addDelay(String delay)
    {
        this.delay = delay;
    }
}

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new  ArrayList<Book>();
    private ArrayList<Reader> readers = new  ArrayList<Reader>();
    private ArrayList<Rental> rentals = new  ArrayList<Rental>();

    public Library()
    {

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
            books.get(i).bookDisp();
        }
    }

    public void search(String key)
    {
        int i=0;
        while((i< books.size()))
        {
            if(key==books.get(i).getAuthor()
                ||key==books.get(i).getTitle()
                ||key==books.get(i).getIsbn()
                ||key==books.get(i).getYear()
                ||key==books.get(i).getGenre())
            {
                System.out.println("Ksiazka znaleziona!");
                books.get(i).bookDisp();
            }
            i++;
        }
    }
}

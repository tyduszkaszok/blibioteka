public class Book {
    private String title;
    private String author;
    private String year;

    private String genre;
    private String isbn;

    private boolean rented;

    public Book(String title, String author, String year, String genre, String isbn){
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getYear(){
        return year;
    }

    public String getGenre()
    {
        return genre;
    }

    public String getIsbn(){
        return isbn;
    }

    public boolean getRented(){ return rented; }

    public void bookDisp()
    {
        System.out.println("Tytul: " + getTitle() +"\n");
        System.out.println("Autor: " + getAuthor() +"\n");
        System.out.println("ISBN: " + getIsbn() +"\n");
        System.out.println("ISBN: " + getYear() +"\n");
        if (this.rented)
        {
            System.out.println("Ta ksiaka jest niedostepna!\n");
        }
        else
        {
            System.out.println("Ta ksiazka jest dostepna!\n");
        }

        System.out.println("--------------------------------------------\n\n");
    }
    public void isRented(boolean rented)
    {
        this.rented = rented;
    }
}

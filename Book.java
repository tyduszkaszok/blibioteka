public class Book {
    private String title;
    private String author;
    private int year;
    private String genre; // Pomyśl nad enumem może
    private String isbn; // Może uuid, będzie unikalny?

    private boolean rented;

    public Book(String title, String author, int year, String genre, String isbn){
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

    public int getYear(){
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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Tytul: ").append(getTitle()).append("\n");
        stringBuilder.append("Autor: ").append(getAuthor()).append("\n");
        stringBuilder.append("ISBN: ").append(getIsbn()).append("\n");
        stringBuilder.append("Rok wydania: ").append(getYear()).append("\n");

        if (this.rented) {
            stringBuilder.append("Ta książka jest niedostępna!\n");
        } else {
            stringBuilder.append("Ta książka jest dostępna!\n");
        }

        stringBuilder.append("--------------------------------------------\n\n");

        return stringBuilder.toString();
    }
    public void isRented(boolean rented)
    {
        this.rented = rented;
    }
}

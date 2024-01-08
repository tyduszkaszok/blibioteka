import java.util.ArrayList;

public class Reader {

    private String name;

    private String surname;

    private String id;

    private ArrayList<String> history = new ArrayList<>();

    public Reader(String name, String surname, String id)
    {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getId(){
        return id;
    }

    public void addHistory(Book book)
    {
        this.history.add(book.getTitle());
    }

    public void dispHistory()
    {
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }
}

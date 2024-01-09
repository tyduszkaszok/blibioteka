import java.math.BigDecimal;
import java.util.ArrayList;

public class Reader {

    private String name;

    private String surname;

    private int id;

    private double penalty = 0.0;

    private ArrayList<String> history = new ArrayList<>();
    private BigDecimal fee = BigDecimal.ZERO;

    public Reader(String name, String surname, int id)
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

    public int getId(){
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

    public void increasePenalty(double penalty)
    {
        this.penalty += penalty;
    }

    public double getPenalty()
    {
        return penalty;
    }
}

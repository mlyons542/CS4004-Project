import java.util.ArrayList;

public class Department {
    private ArrayList<Book> books;

    public Department() {
        books = new ArrayList<Book>();
    }

    @Override 
    public String toString() {
        String ans = "";
        for (Book b : books) {
            ans = b.toString();
        }
        return ans;
    }
}

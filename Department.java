import java.util.ArrayList;

public class Department extends Library{
    private String name;
    private ArrayList<Book> books;

    public Department(String name) {
        books = new ArrayList<Book>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public String acquireBook(String b) {
        String ans = "This book could not be found";
        for (Book bk : books) {
            if (bk.getTitle() == b) {
                ans = bk.toString();
            }
        }
        return ans;
    }

    public String getBookTitle(String t) {
        String ans = "";
        for (Book bk : books) {
            if (bk.getTitle() == t) {
                ans = t;
            }
        }
        return ans;
    }

    @Override 
    public String toString() {
        String ans = "Name: " + this.name + "\n";
        for (Book b : books) {
            ans += b.toString();
        }
        return ans;
    }
}

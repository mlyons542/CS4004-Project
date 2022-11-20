import java.util.ArrayList;

public class Department extends Library{
    private String name;
    private ArrayList<Book> books;
    private boolean sub;
    private String subbedTo;

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
                ans = bk.getTitle();
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

    public void subbed(Boolean b, String to) {
        this.sub = b;
        this.subbedTo = to;
    }

    public Boolean getSub() {
        return sub;
    }

    public String getSubbedTo() {
        return subbedTo;
    }

    @Override 
    public String toString() {
        String ans = "";
        for (Book b : books) {
            ans += b.toString();
        }
        return ans;
    }
}

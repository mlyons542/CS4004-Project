import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class Tester {
    
    @Test
    public void checkUsername() {
        Library uwon = new Library();
        User joe = new User("joesmith22", "customer");
        joe.getRole();
        assertTrue((joe.getRole() == "customer"), "customer");
    }

    @Test
    public void checkBookWasAdded() {
        Library uwon = new Library();
        Department standard = new Department("standard");
        standard.addBook(new Book("Biology Facts", "Joe Smith", "Biology"));
        assertTrue(standard.getBookTitle("Biology Facts") == "Biology Facts");
    }

    @Test
    public void checkSub() {
        Library uwon = new Library();
        Department standard = new Department("standard");
        standard.subbed(true, "Science Facts");
        assertTrue(standard.getSub() == true);
    }

    @Test
    public void checkNecessarySubs() {
        Library uwon = new Library();
        Department standard = new Department("standard");
        standard.subbed(true, "Science Facts");
        standard.necessarySubs();
        assertTrue(standard.necessarySubs() == "");
    }

    @Test
    public void checkBookOut() {
        Library uwon = new Library();
        Department standard = new Department("standard");
        standard.addBook(new Book("Biology Facts", "Joe Smith", "Biology"));
        assertTrue(standard.acquireBook("Biology Facts") != null);
    }
}

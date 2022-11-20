import java.util.ArrayList;

public class Library {
    private ArrayList<Department> departments;

    public Library() {
        departments = new ArrayList<Department>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void removeDepartment(Department d) {
        departments.remove(d);
    }

    public String returnDepartment(Department d) {
        Department dep = new Department("dep");
        for (int i = 0; i < departments.size(); i++) {
            if(departments.get(i) == d) {
                dep = d;
            }
        }
        return dep.toString();
    }

    public String biblioSearch(Object o) {
        String ans = "";
        if (o instanceof Book) {
            String s = o.toString();
            Department d = new Department("d");
            ans += d.acquireBook(s);
            
        } 
        return ans;
    }

    public String loan(String title) {
        String ans = "Sorry, that book could not be found";
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getBookTitle(title) == title) {
                ans = "You may borrow " + title + " for 30 days";
                break;
            }
        }
        return ans;
    }

}

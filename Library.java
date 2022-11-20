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
        Department dep = new Department();
        for (int i = 0; i < departments.size(); i++) {
            if(departments.get(i) == d) {
                dep = d;
            }
        }
        return dep.toString();
    }
}

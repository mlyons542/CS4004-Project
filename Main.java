public class Main {
    public static void main(String[] args) {
        Library uwon = new Library();
        Department standard = new Department("standard");
        standard.addBook(new Book("Biology Facts", "Joe Smith", "Biology"));
        /*System.out.println(standard.toString());
        //System.out.println(standard.acquireBook("Biology Facts"));
        System.out.println(standard.getBookTitle("Biology Facts"));
        System.out.println(uwon.loan("Biology Facts"));
        standard.subbed(true, "Science Facts");
        System.out.println(standard.getSub());
        standard.subbed(true, "Science Facts");
        standard.subbed(true, "Science Facts");
        standard.subbed(true, "Science Facts");
        System.out.println(standard.necessarySubs());*/
        System.out.println(standard.acquireBook("Biology Facts"));
    }
}

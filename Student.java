import java.util.List;
import java.util.ArrayList;
class Student {
    private String name;
    private int studentID;
    private List<String> borrowedResources;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.borrowedResources = new ArrayList<>();
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public int getStudentID() {
        return studentID;
    }
    public void borrowResource(List<LibraryResource> resources, String title) {
        for (int i = 0; i < resources.size(); i++) {
            LibraryResource resource = resources.get(i);
            if (resource.getTitle().equals(title)) {
                resource.borrowResource();
                resources.remove(i);
                borrowedResources.add(title);
                return;
            }
        }
        System.out.println("Resource with title '" + title + "' not available.");
    }

    public void printBorrowedResources() {
        System.out.println("Resources borrowed by " + name + " " + studentID + ":");
        for (String title : borrowedResources) {
            System.out.println(title);
        }
    }
}
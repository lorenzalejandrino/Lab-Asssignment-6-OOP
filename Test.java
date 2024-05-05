import java.util.List;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {

        List<LibraryResource> resources = new ArrayList<>();

        LibraryResource book1 = new Book("The Hunger Games");
        LibraryResource book2 = new Book("Catching Fire");

        LibraryResource journal1 = new Journal("Environmental Science & Technology");
        LibraryResource journal2 = new Journal("Journal of Economic Psychology");

        LibraryResource newspaper1 = new Newspaper("Philippine Daily Inquirer- May 5, 2024");
        LibraryResource newspaper2 = new Newspaper("The Philippine Star - May 5, 2024");


        resources.add(book1);
        resources.add(book2);

        resources.add(journal1);
        resources.add(journal2);

        resources.add(newspaper1);
        resources.add(newspaper2);


        Student ace = new Student("Ace", 1001);
        Student ban = new Student("Ban", 1002);
        Student denice = new Student ("Denice", 1003);


        ace.borrowResource(resources, "The Hunger Games");
        ace.borrowResource(resources, "Environmental Science & Technology");

        ban.borrowResource(resources, "Catching Fire");
        ban.borrowResource(resources, "Journal of Economic Psychology");

        denice.borrowResource(resources,"Philippine Daily Inquirer- May 5, 2024");
        denice.borrowResource(resources,"The Philippine Star - May 5, 2024");
        System.out.println();

        ace.printBorrowedResources();
        System.out.println();
        ban.printBorrowedResources();
        System.out.println();
        denice.printBorrowedResources();
        System.out.println();


        ban.borrowResource(resources, "The Hunger Games");
    }
}
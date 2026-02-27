package j_relationships.aggregation;

public class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayInfo() {
        return "The book \"" + this.title + "\" has " + this.pages + " pages";
    }
}

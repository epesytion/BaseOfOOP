package j_relationships.j1_aggregation;

public class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayBookInfo() {
        return "The book \"" + this.title + "\" has " + this.pages + " pages";
    }
}

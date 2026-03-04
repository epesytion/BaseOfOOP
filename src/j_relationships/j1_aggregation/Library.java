package j_relationships.j1_aggregation;

public class Library {
    //what the library should have?
    String name;
    int year;
    Book[] books; //the books that stored in library

    Library(String name, int year, Book[] books) {//constructor for library
        this.name = name;
        this.year = year;
        this.books = books;
        //3. Here where the aggregation comes (go to main class)
    }
    void displayLibInfo() {
        System.out.println(this.name + " " + this.year);
        System.out.println("📚 The list of books in the library: ");
        for(int i = 0; i < this.books.length; i++) {
            System.out.println((i+1)+ ". " + this.books[i].displayBookInfo());
        }
    }
}

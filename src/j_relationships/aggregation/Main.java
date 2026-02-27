package j_relationships.aggregation;

public class Main {
    //Aggregation = represents a 'has-a' relationship between an objects
    //              One object contain another object as part of its structure
    //              but the contained object/s can exist independently.
    //              We will consider example with books and libraries (they both can exist independently)
    static void main(String[] args) {
        Book book1 = new Book("Harry Potter: The Chamber of Secrets", 480);
        Book book2 = new Book("Romeo and Juliet", 192);
        Book book3 = new Book("The Lord of the Rings", 1216);

        Book[] books = {book1, book2, book3};

        //2.
        // From here, go to Library class and work with it

        //3.
        Library library = new Library("Kazakhstan National Academic Library", 1910, books);
        //And, that's the aggregation. The Library has book objects in it
        library.displayInfo();

    }
}

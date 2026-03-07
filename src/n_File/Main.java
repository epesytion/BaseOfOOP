package n_File;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static void main(String[] args) {
        // FileWrite = for small or medium-sized text files
        // FileWriter writer = new FileWriter("TEST.txt"); //But lets do it in try-catch block to prevent errors with writing

        try(FileWriter writer = new FileWriter("C:\\Users\\Sepe\\IdeaProject\\BaseOfOOP\\src\\n_File\\files\\TEST.txt")){
            //'TEST.txt' will appear in the  bcs we've defined the absolute path
            //if we didnt, it will appear in 'src'
            writer.write("Abish is GOAT");
            System.out.println("File writing has been written");
        }
        catch (IOException e){
            System.out.println("Could not write file");
        }
        //But, if we misspell the path, f.e. writing 'Deskto' for 'Desktop' we will have an exception




        // BufferedWriter = for large amounts of text
        // PrintWrite = Best for structured data, like reports of logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)
    }
}

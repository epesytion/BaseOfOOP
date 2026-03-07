package n_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class file_reader {
    static void main(String[] args) {
        // BufferedReader + FileReader = best for reading text file line-by-line

        String path = "C:\\Users\\Sepe\\IdeaProject\\BaseOfOOP\\src\\n_File\\files\\TEST.txt"; //We'll use file that we created in 'Main'
        //Let's read file also handling it by try-catch
        try(BufferedReader bWriter = new BufferedReader(new FileReader(path))){
            System.out.println("File exists");
            String line;
            while((line = bWriter.readLine()) != null){
                System.out.println("The text: " + line);
            } //WHILE our bWrites reads information, the loop goes
        }

        //Handle exceptions with file locations
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        //We also should handle any other file exceptions
        catch(IOException e){
            System.out.println("Something went wrong");
        }


        // FileInputStream = for binary files (e.g., images, audios)
        // RandomAccessFile = best for read/write specific portions of a large file
    }
}

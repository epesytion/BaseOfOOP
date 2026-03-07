package n_File;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class audioPlayer {
    // How to play audio with Java (.wav, .au, .aiff)
    static void main(String[] args) {
        String path = "C:\\Users\\Sepe\\IdeaProject\\BaseOfOOP\\src\\n_File\\files\\natori-—-Just-Between-Us_1.wav"; //path to file
        File natori = new File(path); //Creating object of "File" class and passing the path into the arguments
        //Don't forget to import the 'File' class

        //We'll declare the audioInputStream in brackets. It allows us to not creating a finally block with closing the file,
        //it will close automatically

        try (Scanner sc = new Scanner(System.in); AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(natori)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream); //opening the clip (not playing it, не путай)

//            clip.start();

            String response = "";

            while (!response.equals("Q")) { //the program (the audio) ends if user types "Q"
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter choice: ");
                response = sc.nextLine();
                response = response.toUpperCase(); //to handle "q" inputs

                switch (response) {
                    case "P":
                        clip.start();
                        break;
                    case "S":
                        clip.stop();
                        break;
                    case "R":
                        clip.setMicrosecondPosition(0); //Resetting the audio
                        break;
                    case "Q":
                        clip.close();
                        break;
                    default:
                        System.out.println("Wrong choice");
                        System.out.println();
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can't locate file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("You need to have file of .wav, .au, .aiff");
        } catch (LineUnavailableException e) {
            System.out.println("Audio line is unavailable");
        } finally {
            System.out.println("Audio player finished the work");
        }
    }


}

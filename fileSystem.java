import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileSystem {

    public static void main(String[] args) {
        // // code to create a new file
        // File myFile = new File("bckfile123.txt");
        // try {
        //     myFile.createNewFile();
        // } catch (IOException e) {
        //     System.out.println("unable to create this file");
        //     e.printStackTrace();
        // } 

        // try {
        //     FileWriter fileWriter = new FileWriter("bckfile123.txt");
        //     fileWriter.write("This is writing in file using FileWriter \n okay bro bye");
        //     fileWriter.close();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // // Reading a file
        // File myFile = new File("sample.txt");
        // try {
        //     Scanner sc = new Scanner(myFile);
        //     while (sc.hasNextLine()) {
        //         System.out.println(sc.nextLine());
        //     }
        //     sc.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

    
        File myFile = new File("bckfile123.txt");
        if (myFile.delete()) {
            System.out.println("successfully deleted");
        }
        else System.out.println("some error occured");
    
    }
}

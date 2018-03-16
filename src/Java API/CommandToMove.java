// Import stuff
import static java.lang.System.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// The main class that Beaver.java connects to. This initializes the file we're going to
// write and allows methods/functions inside the Beaver class to write to "moveCommand.txt".
class TestingWriteCommands{
  public static void main(String args[]) throws IOException{
    final int ID = 48; // Use this for the beaver's ID.
    
    File file = new File(".\\moveCommand.txt"); // Local directory where this code is located at
    FileWriter writer = new FileWriter(file);
    Beaver beaver = new Beaver(ID, writer);
    
    // Checks to see if the "moveCommand.txt" is already inside the directory
    if (!(file.createNewFile())){
      System.out.println("File already exists.\n" + 
                         "Overwritting the file.");
    }
    else{
      System.out.println("Writing a new file called \"moveCommand.txt\"");
    }
    
    // The object's functions 
    beaver.forward();
    beaver.turnLeft();
    beaver.turnRight();
    beaver.buildDam();
    beaver.gather();
    writer.close();
  }
}
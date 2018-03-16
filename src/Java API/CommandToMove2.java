// Import stuff
import static java.lang.System.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// The main class that Beaver2.java connects to. This initializes the file we're going to
// write, but makes the methods/functions in the Beaver2 class output Strings so main can
// write those strings into "moveCommand.txt"
class CommandToMove2{
  public static void main(String args[]) throws IOException {
    final int ID = 48; // Use this for the beaver's ID.
    
    Beaver2 beaver = new Beaver2(ID);
    File file = new File(".\\moveCommand.txt"); // Local directory where this code is located at
    FileWriter writer = new FileWriter(file);
    
    // Checks to see if "moveCommand.txt" is in the directory
    if (!(file.createNewFile())){
      System.out.println("File already exists.\n" + 
                         "Overwritting the file.");
    }
    else{
      System.out.println("Writing a new file called \"moveCommand.txt\"");
    }
    
    // Writes the move commands into "moveCommand.txt"
    writer.write(beaver.forward());
    writer.write(beaver.turnLeft());
    writer.write(beaver.turnRight());
    writer.write(beaver.buildDam());
    writer.write(beaver.gather());
    writer.close();
  }
}
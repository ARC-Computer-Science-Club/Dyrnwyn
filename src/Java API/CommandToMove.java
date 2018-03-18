// Import stuff
import static java.lang.System.*;
import java.io.IOException;

// The main class that Beaver.java connects to. This initializes the file we're going to
// write and allows methods/functions inside the Beaver class to write to "moveCommand.txt".
class TestingWriteCommands{
  public static void main(String args[]) throws IOException{
    final int ID = 255; // Use this for the beaver's ID.
    Beaver beaver = new Beaver(ID);
    
    // The object's functions 
    beaver.forward();
    beaver.turnLeft();
    beaver.turnRight();
    beaver.buildDam();
    beaver.gather();
    beaver.returnBeaverWriter().close();
  }
}
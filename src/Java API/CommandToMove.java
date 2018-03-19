// Import stuff
import static java.lang.System.*;
import java.io.IOException;

// The main class that Beaver.java connects to. This initializes the file we're going to
// write and allows methods/functions inside the Beaver class to write to "moveCommand.txt".
class TestingWriteCommands{
  public static void main(String args[]) throws IOException{
    Beaver beaver0 = new Beaver(0);
    Beaver beaver1 = new Beaver(1);
    Beaver beaver2 = new Beaver(2);
    Beaver beaver3 = new Beaver(3);
    Beaver beaver4 = new Beaver(4);
    
    // The object's functions
    beaver0.forward();
    beaver1.forward();
    beaver2.forward();
    beaver3.forward();
    beaver4.forward();
    
    beaver0.turnLeft();
    beaver1.turnLeft();
    beaver2.turnLeft();
    beaver3.turnLeft();
    beaver4.turnLeft();
    
    beaver0.turnRight();
    beaver1.turnRight();
    beaver2.turnRight();
    beaver3.turnRight();
    beaver4.turnRight();
    
    beaver0.buildDam();
    beaver1.buildDam();
    beaver2.buildDam();
    beaver3.buildDam();
    beaver4.buildDam();
    
    beaver0.gather();
    beaver1.gather();
    beaver2.gather();
    beaver3.gather();
    beaver4.gather();
    
    beaver0.returnBeaverWriter().close();
    beaver1.returnBeaverWriter().close();
    beaver2.returnBeaverWriter().close();
    beaver3.returnBeaverWriter().close();
    beaver4.returnBeaverWriter().close();
  }
}
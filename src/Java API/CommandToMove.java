// Needs the IOException...
import java.io.IOException;

/* 
The main class that Beaver.java, that's in the same folder as this file, connects to. This test file will create a
beaver Commander and some beavers so the Commander can interact with each
beaver and then writes the order of each beaver to "moveCommand.txt"
                    
                    *IN SEQUENTIAL ORDER*
                    
It's pretty important that the commands SHOULD be printed out how they are
shown. The other versions before had each command group up with each specific 
beaver so you wouldn't know what beaver did their commands first.
*/
class CommandToMove2{
  public static void main(String args[]) throws IOException{
    
    // Use this for the beaver's ID.
    final int ID = 48;
    
    // Each beaver needs a commander to communicate to each other.
    Commander beaverCommander = new Commander();
    
    // Each beaver unit
    Beaver beaver0 = new Beaver(ID + 0, beaverCommander);
    Beaver beaver1 = new Beaver(ID + 1, beaverCommander);
    Beaver beaver2 = new Beaver(ID + 2, beaverCommander);
    Beaver beaver3 = new Beaver(ID + 3, beaverCommander);
    Beaver beaver4 = new Beaver(ID + 4, beaverCommander);
    Beaver beaver5 = new Beaver(ID + 5, beaverCommander);
    
    // Each beaver's orders
    beaver0.forward();
    beaver1.forward();
    beaver2.forward();
    beaver3.forward();
    beaver4.forward();
    beaver5.forward();
    
    beaver0.turnLeft();
    beaver1.turnLeft();
    beaver2.turnLeft();
    beaver3.turnLeft();
    beaver4.turnLeft();
    beaver5.turnLeft();    
    
    beaver0.turnRight();
    beaver1.turnRight();
    beaver2.turnRight();
    beaver3.turnRight();
    beaver4.turnRight();
    beaver5.turnRight();
    
    beaver0.buildDam();
    beaver1.buildDam();
    beaver2.buildDam();
    beaver3.buildDam();
    beaver4.buildDam();
    beaver5.buildDam();
    
    beaver0.gather();
    beaver1.gather();
    beaver2.gather();
    beaver3.gather();
    beaver4.gather();
    beaver5.gather();
    
    beaverCommander.printCommandList(); // The commander will print to the console the command orders. 
    beaverCommander.commenceOrder(); // Then the commander will write it out to "moveCommand.txt"
  }
}
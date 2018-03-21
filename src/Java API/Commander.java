// Import things
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// The Commander is the one who combines all the commands of each beaver, or any
//other animal, into one list and prints it out to "moveCommand.txt"
class Commander{
  private File file = new File(".\\moveCommand.txt");  // Identify a new text file at the local directory where this code is located at
  private FileWriter writer = new FileWriter(file); // Readys the FileWriter linked to "moveCommand.txt" so it can be written.
  protected StringBuilder commandList = new StringBuilder(); // Adds each beaver's command to this StringBuilder 
  
  Commander()throws IOException{
    FileWriter writer = new FileWriter(file, true); // Needed here so we can erase all the content in "moveCommand.txt"
  }
  
  // This method/function is needed when the Commander wants to add the beaver,
  //or any animal, commands into its command list.
  public StringBuilder getCommandList(){
    return commandList;
  }
  
  // When you want to ask the Commander to print out its current command list.
  public void printCommandList(){
    System.out.println("Here you go! The current command order is:\n" + commandList);
  }
  
  // The Commander will write its command list to "moveCommand.txt"
  public void commenceOrder()throws IOException{
    String tactic = new String(commandList);
    writer.write(tactic);
    writer.close();
  }
}
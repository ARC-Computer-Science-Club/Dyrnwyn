// Import stuff
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

enum Direction{
  N, E, S, W
} 

class Beaver{
  private Direction direction;
  private int wood = 0;
  private int beaverNumber;
  private File file = new File(".\\moveCommand.txt");  // Identify a new text file at the local directory where this code is located at
  private FileWriter writer = new FileWriter(file); // Readys an object linked to "moveCommand.txt" so it can be written.
  private char[] idToASCII;
  
  // Constructor. Also converts the beaver's ID into ASCII.
  Beaver(int beaverNumber) throws IOException{
    this.beaverNumber = beaverNumber;
    this.idToASCII= new char[(beaverNumber/256) + 1];
    
    for (int i = 0; i < idToASCII.length; i++){
      if (beaverNumber - 255 > 0){
        idToASCII[i] = 255;
        beaverNumber -= 255;
      }
      else{
        idToASCII[i] = (char)beaverNumber;
      }
    }
    
    // Checks to see if the "moveCommand.txt" is already inside the directory
    if (!(file.createNewFile())){
      System.out.println("File already exists.\n" + 
                         "Overwritting the file.");
    }
    else{
      System.out.println("Writing a new file called \"moveCommand.txt\"");
    }
    
  }
  
  // Writes each character into the file for all of the commands
  public void forward() throws IOException{
    writer.write("^"); // Forward command
    for (int i = 0; i < (idToASCII.length); i++){ // The beaver ID in ASCII
      writer.write(idToASCII[i]);
    }
    writer.write((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
  }
  
  public void turnLeft() throws IOException{
    writer.write("<"); // Turn Left command
    for (int i = 0; i < (idToASCII.length); i++){ // The beaver ID in ASCII
      writer.write(idToASCII[i]);
    }
    writer.write((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
  }
  
  public void turnRight() throws IOException{
    writer.write(">"); // Turn Right command
    for (int i = 0; i < (idToASCII.length); i++){ // The beaver ID in ASCII
      writer.write(idToASCII[i]);
    }
    writer.write((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
  }
  
  public void buildDam() throws IOException{
    writer.write("#"); // Build Dam Command
    for (int i = 0; i < (idToASCII.length); i++){ // The beaver ID in ASCII
      writer.write(idToASCII[i]);
    }
    writer.write((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
  }
  
  public void gather() throws IOException{
    writer.write("+"); // Gather command
    for (int i = 0; i < (idToASCII.length); i++){ // The beaver ID in ASCII
      writer.write(idToASCII[i]);
    }
    writer.write((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
  }
  
  // Returns this specific beaver's "writer" so the main java file can close the file.
  // Although we can put this in the Character superclass of the Beaver Class so all
  // characters can return this statement.
  public FileWriter returnBeaverWriter(){
    return (this.writer);
  }
  
  // Misc. stuff, delete them if you want. 
  public Direction currentDirection(){
    return this.direction;
  }
  
  public int woodAmount(){
    return wood;
  }
  
  public int ID(){
    return beaverNumber;
  }
}
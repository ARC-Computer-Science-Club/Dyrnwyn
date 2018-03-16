// Import stuff
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

enum Direction{
  N, E, S, W
} 

// Imports the FileWriter object so we can write to the file from here instead of main.
class Beaver{
  private Direction direction;
  private int wood = 0;
  private int beaverNumber;
  private FileWriter writer;
  private char[] idToASCII;
  
  // Constructor. Also converts the beaver's ID into ASCII.
  Beaver(int beaverNumber, FileWriter writer){
    this.beaverNumber = beaverNumber;
    this.idToASCII= new char[(beaverNumber/255) + 1];
    this.writer = writer;
    System.out.print(idToASCII.length);
    for (int i = 0; i < idToASCII.length; i++){
      if (beaverNumber - 255 > 0){
        idToASCII[i] = 255;
        beaverNumber -= 255;
      }
      else{
        idToASCII[i] = (char)beaverNumber;
      }
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
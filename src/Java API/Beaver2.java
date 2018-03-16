enum Direction2{
  N, E, S, W
} 

// In this case, we don't use the FileWriter class in here.
// Instead, we are using the BuildString class.
class Beaver2{
  private Direction2 direction;
  private int wood = 0;
  private int beaverNumber;
  private String idOfBeaver = "";
  private StringBuilder moveCommand = new StringBuilder(); // Enables strings to be concatenated
  
  // Constructor. Also converts the beaver's ID into ASCII.
  Beaver2(int beaverNumber){
    this.beaverNumber = beaverNumber;
    char[] idToASCII= new char[(beaverNumber/256) + 1];
    for (int i = 0; i < idToASCII.length; i++){
      if (beaverNumber - 255 > 0){
        idToASCII[i] = 255;
        beaverNumber -= 255;
      }
      else{
        idToASCII[i] = (char)beaverNumber;
      }
    }
    idOfBeaver = String.valueOf(idToASCII);
  }
  
  // Each command concatenates the "moveCommand" StringBuilder and copies the contents to the
  // newly created String "moveComamndToFile" and outputs that string into main so the FileWriter
  // can write the strings into "moveCommand.txt".
  public String forward(){
    String moveCommandToFile = "";
    moveCommand.append("^"); // Forward Command
    moveCommand.append(idOfBeaver); // The beaver ID in ASCII
    moveCommand.append((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
    moveCommandToFile = new String(moveCommand); // Copy
    moveCommand.delete(0, moveCommand.length()); // Delete contents on the StringBuffer so we can use it again.
    return moveCommandToFile; // Returns the String
  }

  public String turnLeft(){
    String moveCommandToFile = "";
    moveCommand.append("<");
    moveCommand.append(idOfBeaver);
    moveCommand.append((char)0 + "\n");
    moveCommandToFile = new String(moveCommand);
    moveCommand.delete(0, moveCommand.length());
    return moveCommandToFile;
  }
  
  public String turnRight(){
    String moveCommandToFile = "";
    moveCommand.append(">");
    moveCommand.append(idOfBeaver);
    moveCommand.append((char)0 + "\n");
    moveCommandToFile = new String(moveCommand);
    moveCommand.delete(0, moveCommand.length());
    return moveCommandToFile;
  }
  
  public String buildDam(){
    String moveCommandToFile = "";
    moveCommand.append("#");
    moveCommand.append(idOfBeaver);
    moveCommand.append((char)0 + "\n");
    moveCommandToFile = new String(moveCommand);
    moveCommand.delete(0, moveCommand.length());
    return moveCommandToFile;
  }
  
  public String gather(){
    String moveCommandToFile = "";
    moveCommand.append("+");
    moveCommand.append(idOfBeaver);
    moveCommand.append((char)0 + "\n");
    moveCommandToFile = new String(moveCommand);
    moveCommand.delete(0, moveCommand.length());
    return moveCommandToFile;
  }
  
  // Misc. stuff, delete them if you want.
  public Direction2 currentDirection(){
    return this.direction;
  }
  
  public int woodAmount(){
    return wood;
  }
  
  public int ID(){
    return beaverNumber;
  }
}
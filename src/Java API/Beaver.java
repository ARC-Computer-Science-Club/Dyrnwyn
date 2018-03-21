enum Direction{
  N, E, S, W
} 

// In this case, we don't use the FileWriter class in here.
class Beaver{
  private Direction direction;
  private int wood = 0;
  private int beaverNumber;
  private String idOfBeaver = "";
  private Commander beaverCommander;
  private StringBuilder command = new StringBuilder();
  
  // Constructor. Also converts the beaver's ID into ASCII.
  Beaver(int beaverNumber, Commander beaverCommander){
    this.beaverNumber = beaverNumber;
    this.beaverCommander = beaverCommander;
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
  
  // Each beaver tells the beaverCommander it's under and then the beaverCommander will write it down
  public void forward(){
    
    // The beaver readys its command to the commander
    command.append("^"); // Forward Command
    command.append(idOfBeaver); // The beaver ID in ASCII
    command.append((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
    
    // Then the beaverCommander writes the beaver's command down
    beaverCommander.getCommandList().append(command); // The beaverCommander copys the command to the commandOrder 
    command.delete(0, command.length()); // The beaver will stand by for more orders
  }
  
  public void turnLeft(){
    
    command.append("<"); // Turn left Command
    command.append(idOfBeaver); // The beaver ID in ASCII
    command.append((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
    
    beaverCommander.getCommandList().append(command);  
    command.delete(0, command.length()); 
  }
  
  public void turnRight(){
    
    command.append(">"); // Turn right Command
    command.append(idOfBeaver); // The beaver ID in ASCII
    command.append((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
    
    beaverCommander.getCommandList().append(command);  
    command.delete(0, command.length()); 
  }
  
  public void buildDam(){
    
    command.append("#"); // Build Command
    command.append(idOfBeaver); // The beaver ID in ASCII
    command.append((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
    
    beaverCommander.getCommandList().append(command); 
    command.delete(0, command.length());
  }
  
  public void gather(){
    
    command.append("+"); // Gather Command
    command.append(idOfBeaver); // The beaver ID in ASCII
    command.append((char)0 + "\n"); // NULL terminating + newline. Will delete the newline character later.
    
    beaverCommander.getCommandList().append(command); 
    command.delete(0, command.length());
  }
  
  
  // Misc. stuff, delete them if you want.
  public Direction direction(){
    return this.direction;
  }
  
  public int woodAmount(){
    return wood;
  }
  
  public int ID(){
    return beaverNumber;
  }
}
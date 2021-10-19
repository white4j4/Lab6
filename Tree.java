class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

String getName(){
  return treeName;
}
String getType() {
  return treeType;
}
boolean getLeafLoss(){
  return leavesFall;
}
String getColor(){
  return leafColor;
}
void setName(String theTreeName) {
  treeName = theTreeName;
}
void setType(String theTreeType){
  treeType = theTreeType;
}
void setLeafLoss(boolean theLeavesFall) {
  leavesFall = theLeavesFall;
}
void setLeafColort(String theLeafColor) {
  leafColor = theLeafColor;
}
void print() {
  System.out.println("This is a " + treeName + " tree."); 
  System.out.println("It is a " + treeType + " and its leaves are currently " + leafColor + ".");
  if (leavesFall == false) {
    System.out.println("It does not lose its leaves for the winter.");
  }
  else {
    System.out.println("It does lose its leaves for the winter.");
  }
}
}
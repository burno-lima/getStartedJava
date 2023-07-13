public class Main{
  // Static method
  static void myStaticMethod(){
    System.out.println("Static methods can be calleb without createg objects");
  }

  // Pulbic method
  public void myPublicMethod(){
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args){
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

  Main myObj = new Main(); // Create an anbject of Main
  myObj.myPublicMethod(); // Call the public method
  }
}

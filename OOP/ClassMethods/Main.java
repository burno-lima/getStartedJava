public class Main {
  static void myMethodStatic() {
    /*Static methods can be called without creating objects*/
    System.out.println("Method Static");
  }

  public void myMethodPublic() {
    /*Public methods must be called by creating objects*/
    System.out.println("Method Public!");
  }

  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String[] args){
    myMethodStatic();
    
    Main myObj = new Main();
    myObj.myMethodPublic();

    myObj.fullThrottle();
    myObj.speed(200);
  }
}

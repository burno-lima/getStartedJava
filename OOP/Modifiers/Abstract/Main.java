abstract class Main{
  public String fname = "Burno";
  public int age = 24;
  public abstract void study(); // abstract method
}

class Student extends Main {
  public int gradutionYear = 2026;
  public void study() { // The body of the abstract method is provided here
    System.out.println("Studing all day long");
  }
}

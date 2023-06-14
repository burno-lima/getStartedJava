public class Main{
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  static void myName(String fname){
    System.out.println(fname + " Refsnes");
  }

  static void myAge(int age, String fname){
    System.out.println(fname + " is " + age);
  }

  static int myMathSum(int x, int y){
    return x + y;
  }

  static void checkAge(int age){
    if (age < 18){
      System.out.println("Access denided - You are not old enough!");
    } else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    myMethod();
    myName("Burno");
    myAge(23, "Burno");
    System.out.println(myMathSum(10, 12));

    int age = myMathSum(10, 8);
    checkAge(age);
  }

}

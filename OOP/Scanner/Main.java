import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter Username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);

    Scanner myInt = new Scanner(System.in);
    System.out.println("What's is age: ");

    int age = myInt.nextInt();
    System.out.println("I have " + age + " age");
  }
}

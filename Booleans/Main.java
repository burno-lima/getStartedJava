public class Main{
  public static void main(String[] args){

    // returns true, because 10 is higher than 9
    int x = 10;
    int y = 9;
    System.out.println(x > y);

    // return true, because the value of x is equal to 10
    System.out.println(x == 10);

    // Old enough to vote
    int myAge = 23;
    int votingAge = 18;
    
    if (myAge >= votingAge) {
      System.out.println("Old enough to vote!");
    } else {
      System.out.println("Not old enough to vote!");
    }

  }
}

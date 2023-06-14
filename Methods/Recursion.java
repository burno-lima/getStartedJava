public class Recursion{
  public static void main(String[] args){
    int result = sum(10);
    System.out.println(result);

    int result2 = sumTwo(5, 10);
    System.out.println(result2);
  }

  public static int sum(int k){
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }

  public static int sumTwo(int start, int end){
    if (end > start){
      return end + sumTwo(start, end - 1);
    } else {
      return end;
    }
  }
}

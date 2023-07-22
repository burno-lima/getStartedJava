import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    cars.addFirst("Fusca");
    System.out.println(cars.getLast());
    System.out.println(cars);
  }
}

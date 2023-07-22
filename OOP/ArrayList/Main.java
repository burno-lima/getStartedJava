import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars.get(0));
    cars.set(0, "Opel");
    System.out.println(cars.get(0));
    // cars.remove(0);
    // cars.clear();
    System.out.println(cars.size());
  }
}

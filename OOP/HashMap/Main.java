import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities.get("USA"));
    capitalCities.remove("England");
    // capitalCities.clear();
    System.out.println(capitalCities.size());
    System.out.println(capitalCities);

    // Loops
    for (String i : capitalCities.values()) {
      System.out.println(i);
    }

    // for-each
    for (String i : capitalCities.keySet()) {
      System.out.println("key: " + i + " value: " + capitalCities.get(i));
    }
  }
}

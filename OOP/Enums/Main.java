enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class Main {
  public static void main(String[] arfs){
    Level myVar = Level.MEDIUM;

    switch(myVar){
      case LOW:
        System.out.println("Low Level");
        break;
      case MEDIUM:
        System.out.println("Medium Level");
        break;
      case HIGH:
        System.out.println("High Level");
        break;
    }

    for (Level le: Level.values()){
      System.out.println(le);
    }
  }
}

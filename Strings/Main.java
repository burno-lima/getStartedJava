public class Main{
  public static void main(String[] args){
    
    // length
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("Then length of the txt string is: " + txt.length());

    // toUpperCase() toLowerCase()
    String name = "Burno Lima";
    System.out.println("Method toUpperCase(): " + name.toUpperCase());
    System.out.println("Method toLowerCase(): " + name.toLowerCase());

    // Finding a Character in a String
    String index = "Finding a Character in a String";
    System.out.println(index.indexOf("String"));

    // Concatenation
    String firstName = "Burno ";
    String lastName = "Lima";
    System.out.println("Concat: " + firstName.concat(lastName));

    // Special Characters
    String special = "It\'s alright.";
    System.out.println(special);
  }
} 

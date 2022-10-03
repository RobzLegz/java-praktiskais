import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static Scanner in = new Scanner(System.in);

  public static String getText() {
    System.out.println("Enter your own text?");
    System.out.println("y [yes]");
    System.out.println("n [no]");

    String choice = in.nextLine();

    String text;

    if (choice.toLowerCase().equals("y")) {
      System.out.println("Enter text:");
      text = in.nextLine();
    } else {
      text = "Ir pavasaris, daudz jaunu lapu mostas, dzimst jauni pumpuri un kukaini tiem apkart rosas";
    }

    return text;
  }

  public static char getSymbol() {
    // Scanner sus = new Scanner(System.in);

    System.out.print("Enter symbol: ");
    String symbol = in.nextLine();

    if (symbol.length() != 1) {
      System.out.print("Invalid symbol, try again: ");
      symbol = in.nextLine();
    }

    return symbol.toLowerCase().charAt(0);
  }

  public static void findWords(char symbol, String text) {
    String[] parts = text.split(" ");
    int totalEq = 0;

    for (int i = 0; i < parts.length; i++) {
      String word = parts[i];
      String lwWord = word.toLowerCase();

      if (lwWord.charAt(0) == symbol) {
        totalEq++;
      }
    }

    System.out.println(
        "There are " + totalEq + " words that start with symbol " + symbol);
  }

  public static void matchSymbols(String text) {
    String[] parts = text.split("");

    String matchingChars = "";

    for (int i = 0; i < parts.length; i++) {
      String character = parts[i];

      if (character.equals(" ") | character.equals(",") | character.equals(".") | matchingChars.contains(character)) {
        continue;
      }

      int csl = text.split(character).length;

      if (csl >= 3) {
        matchingChars += character;
      }
    }

    System.out.println("Matching characters: " + matchingChars);
  }

  public static void main(String[] args) {
    String text = getText();

    char symbol = getSymbol();

    findWords(symbol, text);
    matchSymbols(text);

    in.close();
  }
}

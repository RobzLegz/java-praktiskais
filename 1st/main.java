import java.util.Scanner;

class Main {
  public static Scanner in = new Scanner(System.in);

  public static String getText() {
    System.out.println("Enter your own text?");
    System.out.println("y [yes]");
    System.out.println("n [no]");

    String choice = in.nextLine();

    String S;

    if (choice.toLowerCase().equals("y")) {
      System.out.println("Enter text:");
      S = in.nextLine();
    } else {
      S = "Ir pavasaris, daudz jaunu lapu mostas, dzimst jauni pumpuri un kukaini tiem apkart rosas";
    }

    return S;
  }

  public static char getSymbol() {
    System.out.print("Enter symbol: ");
    String symbol = in.nextLine();

    if (symbol.length() != 1) {
      System.out.print("Invalid symbol, try again: ");
      symbol = in.nextLine();
    }

    return symbol.toLowerCase().charAt(0);
  }

  public static void findWords(char symbol, String S) {
    String[] parts = S.split(" ");
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

  public static void matchSymbols(String S) {
    String[] parts = S.split("");

    String S1 = "";

    for (int i = 0; i < parts.length; i++) {
      String character = parts[i];

      if (character.equals(" ") | character.equals(",") | character.equals(".") | S1.contains(character)) {
        continue;
      }

      int csl = S.split(character).length;

      if (csl >= 3) {
        S1 += character;
      }
    }

    System.out.println("Matching characters: " + S1);
  }

  public static void main(String[] args) {
    String S = getText();

    char symbol = getSymbol();

    findWords(symbol, S);
    matchSymbols(S);

    in.close();
  }
}

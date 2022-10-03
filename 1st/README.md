## 1 uzdevums

### Nosacījumi:
Sastādīt programmu ar Java valodu, kas paredzēta simbolu virkņu apstrādei. Sākumdatus ievada lietotājs.
- noteikt vārdu skaitu, kas sākas ar norādīto simbolu
- izveidot jaunu virkni S1, kur ir visi atkārtoti simboli no virknes S

### kods:

```java
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
```

### Paskaidrojums:

```java
public static Scanner in = new Scanner(System.in);
```

Tiek definēts skeneris - input

```java
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
```

Lietotājam tiek piedāvāts ievadīt tekstu, vai izmantot jau sagatavotu.
Pēc izvēles funkcija atgriež tekstu

```java
public static char getSymbol() {
  System.out.print("Enter symbol: ");
  String symbol = in.nextLine();

  if (symbol.length() != 1) {
    System.out.print("Invalid symbol, try again: ");
    symbol = in.nextLine();
  }

  return symbol.toLowerCase().charAt(0);
}
```

Funkcija liek lietotājam ievadīt simbolu.
Ja simbols garāks par 1, tad tas jāievada no jauna.
Funkcija atgriež simbolu kā mazo burtu char tipā.

```java
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
```

Funkcija argumentos pieņem ievadīto simbolu un tekstu

```java
String[] parts = S.split(" ");
```
Teksts tiek sadalīts pa vārdiem

```java
String lwWord = word.toLowerCase();
```

Vārds tiek pārvērsts uz mazajiem burtiem

```java
if (lwWord.charAt(0) == symbol) {
  totalEq++;
}
```
Ja vārda pirmais burts sakrīt ar ievadīto simbolu, tad tiek palielināts skaitītājs

```java
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
```

```java
String[] parts = S.split("");
```

Funkcija saņem tekstu un to sadala pa simboliem.

```java
if (character.equals(" ") | character.equals(",") | character.equals(".") | S1.contains(character)) {
  continue;
}
```

Ejot pāri simbolu masīvam funkcija pārbauda vai S1 simbolu virkne jau satur šo simbolu un vai šis simbols ir burts. 
Ja S1 virknē jau ir simbols vai simbols nav burts, tad pāriet uz nākamo elementu.

```java
int csl = S.split(character).length;

if (csl >= 3) {
  S1 += character;
}
```

Ja S1 simbolu nesatur un simbols ir burts, tad tad teksts tiek sadalīts tajās vietās, kur sakrīt simboli. Ja teksts sadalīts vairāk par 2 daļām, tad sanāk ka simbols atkārtojas un tas tiek pievienots virknei S1

```java
public static void main(String[] args) {
  String S = getText();

  char symbol = getSymbol();

  findWords(symbol, S);
  matchSymbols(S);

  in.close();
}
```

Galvenā funkcija, kas izsauc pārējās.

### Rezultāts:
![image](https://user-images.githubusercontent.com/62758448/193545469-7440d3fd-7234-4c57-b04c-524adcf0e2e6.png)
 
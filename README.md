# Algoritmi "Java" programmēšanas valodā

## Saturs
1. [Ievads](https://github.com/RobzLegz/java-praktiskais#ievads)
2. [Darba tēma](https://github.com/RobzLegz/java-praktiskais#darba-tēma)
3. [Darba mērķis](https://github.com/RobzLegz/java-praktiskais#darba-mērķis)
4. [Darba uzdevumi](https://github.com/RobzLegz/java-praktiskais#darba-uzdevumi) 
5. [Hipotēze](https://github.com/RobzLegz/java-praktiskais#hipotēze)
6. [1. uzdevums](https://github.com/RobzLegz/java-praktiskais#1-uzdevums)
7. [2. uzdevums](https://github.com/RobzLegz/java-praktiskais#2-uzdevums)
8. [3. uzdevums](https://github.com/RobzLegz/java-praktiskais#3-uzdevums)
9. [Secinājumi](https://github.com/RobzLegz/java-praktiskais#secinājumi)
10. [Izmantotie resursi](https://github.com/RobzLegz/java-praktiskais#izmantotie-resursi)

## Ievads

Java ir firmas "Sun Microsystems" izstrādāta objektorientēta programmēšanas valoda. Valoda, kuras sākotnējais nosaukums bija Oak, tika veidota kā C++ aizstājēja, lai gan tās funkcionalitāte ir tuvāka Objective C.

Valodas Java izstrādes galvenie mērķi bija šādi:
- tai jābūt objektorientētai valodai;
- tai jābūt vairāk vai mazāk neatkarīgai no datora platformas;
- tai jāatbalsta tīkli;
- tai jāvar droši izpildīt kodu no attālinātiem avotiem;

Java ir trešā populārākā programmēšanas valoda pasaulē pēc Python un C.

Plusi:
- Daudzpusība. Java jau sen ir bijusi de facto programmēšanas valoda tīmekļa lietotņu, Android lietotņu un programmatūras izstrādes rīku, piemēram, Eclipse, IntelliJ IDEA un NetBeans IDE, izveidei.
- Kompilators. Javai ir kompilators ar nosaukumu javac, kas pārvērš avota kodu par starpkodu, kas ir pazīstams kā java baitkods. Šis java baitkods nav atkarīgs no nevienas platformas, tas ir, ja avota kodu kompilējat Windows platformā, izmantojot javac kompilatoru, lai jūs varētu palaist šo kodu jebkurā citā platformā, piemēram, Linux, Mac.
- Lietotājam draudzīgums. Javai ir angļu valodai līdzīga gramatika, tāpēc tā ir ideāli piemērota iesācējiem. Jūs varat apgūt Java divos posmos: vispirms Java pamata, pēc tam uzlabotā Java.
- Izstrādes rīki. Integrētā izstrādes vide (IDE) ir viena no Java intriģējošākajām funkcijām. Java IDE ir automatizācijas rīku, redaktoru un atkļūdotāju kolekcija.
- Laba dokumentācija. Tā kā Java ir atvērtā koda programmēšanas valoda, tā ir pilnīgi bezmaksas. Java ir labi dokumentēta, kas ir svarīga valodas iezīme. Tajā ir iekļauts pilns ceļvedis, kas izskaidro visas problēmas, kas var rasties, kodējot Java.
- Izturīgs API. Lai gan Javai ir tikai aptuveni piecdesmit atslēgvārdi, tās lietojumprogrammu saskarne (API) ir plaša un visaptveroša ar dažādām metodēm, kuras var tieši izmantot jebkurā kodā.
- Liela kopiena. Kopienas atbalsts Java ir viens no tās popularitātes virzītājspēkiem. Tai ir otrā lielākā "Stack Overflow" kopiena.

Mūsdienās Java programmēšanas valodai ir parādījušies arī konkurenti, kā kotlin - tiešais konkurents un react-native - mobilo aplikāciju izstrādei.

## Darba tēma
Praktiskais uzdevums Java valodā

## Darba mērķis
Iepazīt Java programmēšanas valodu, izstrādāt ar to algoritmus, paplašināt zināšanas programmēšanā.

## Darba uzdevumi
1. Sastādīt programmu ar Java valodu, kas paredzēta simbolu virkņu apstrādei. Sākumdatus ievada lietotājs.
- noteikt vārdu skaitu, kas sākas ar norādīto simbolu
- izveidot jaunu virkni S1, kur ir visi atkārtoti simboli no virknes S
2. Sastādīt programmu, kas paredzēta viendimensijas masīva apstrādei. Aizpildīt reālo skaitļu masīvu ar n nejaušiem skaitļiem diapazonā -100...100. Izmantojot funkciju printArr() izprintēt uz ekrāna masīvu. Masīvā aizvietot visus negatīvus elementus ar vidējo aritmētisko masīva elementu vērtību.
3. Sastādīt programmu, kas paredzēta divdimensiju masīva apstrādei. Kādā programmā paredzēt
masīva aizpildes veida (ar nejaušiem skaitļiem diapazonā -100…100 vai ar patstāvīgi ievadītiem
elementiem) izvēles iespēju. Masīvu nodod funkcijai, kas paredzēta masīva apstrādei: samainīt
vietām matricas kolonnas, kas satur minimālo un maksimālo elementus. 

## Hipotēze

Domāju, ka problēmu izstrādes laikā nebūs, un apgūšu jaunas zināšanas Java programmēšanas valodā.

## Uzdevumi

### 1 uzdevums

#### Nosacījumi:
Sastādīt programmu ar Java valodu, kas paredzēta simbolu virkņu apstrādei. Sākumdatus ievada lietotājs.
- noteikt vārdu skaitu, kas sākas ar norādīto simbolu
- izveidot jaunu virkni S1, kur ir visi atkārtoti simboli no virknes S

#### kods:

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

#### Paskaidrojums:

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

#### Rezultāts:
![image](https://user-images.githubusercontent.com/62758448/193545469-7440d3fd-7234-4c57-b04c-524adcf0e2e6.png)


### 2 uzdevums

#### Nosacījumi:
Sastādīt programmu, kas paredzēta viendimensijas masīva apstrādei. Aizpildīt reālo skaitļu masīvu ar n nejaušiem skaitļiem diapazonā -100...100. Izmantojot funkciju printArr() izprintēt uz ekrāna masīvu. Masīvā aizvietot visus negatīvus elementus ar vidējo aritmētisko masīva elementu vērtību.

#### kods:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

class Main {
    public static Scanner in = new Scanner(System.in);

    public static int generateRandomBetween(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        return randomNum;
    }

    public static int getAvg(ArrayList<Integer> arr) {
        int total = 0;

        for (int i = 0; i < arr.size(); i++) {
            int mai = arr.get(i);

            total += mai;
        }

        int avg = total / arr.size();

        return avg;
    }

    public static void printArr(ArrayList<Integer> arr) {
        System.out.println("Initial array: ");
        System.out.println(arr);

        int avg = getAvg(arr);
        System.out.println("Average of array elements is " + avg);

        ArrayList<Integer> modArr = arr;

        for (int i = 0; i < modArr.size(); i++) {
            int mai = modArr.get(i);

            if (mai < 0) {
                modArr.set(i, avg);
            }
        }

        System.out.println("Modified array: ");
        System.out.println(modArr);
    }

    public static ArrayList<Integer> genArr(int len) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            int randNr = generateRandomBetween(-100, 100);

            arr.add(randNr);
        }

        return arr;
    }

    public static int getLen() {
        System.out.print("Enter array length: ");

        int n = 0;

        String nStr = in.next();

        boolean valid = false;

        while (!valid) {
            try {
                n = Integer.parseInt(nStr);

                if (n > 0) {
                    valid = true;
                } else {
                    System.out.print("Invalid integer, try again: ");
                    nStr = in.next();
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid integer, try again: ");
                nStr = in.next();
            }
        }

        return n;
    }

    public static void main(String[] args) {
        int n = getLen();

        ArrayList<Integer> arr = genArr(n);

        printArr(arr);

        in.close();
    }
}
```

#### Paskaidrojums:

```java
public static Scanner in = new Scanner(System.in);
```

Tiek definēts skeneris - input

```java
public static int generateRandomBetween(int min, int max) {
    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

    return randomNum;
}
```

Funkcija, kas ģenerē nejaušu skaitli starp minimālo un maksimālo argumentu

```java
public static int getAvg(ArrayList<Integer> arr) {
    int total = 0;

    for (int i = 0; i < arr.size(); i++) {
        int mai = arr.get(i);

        total += mai;
    }

    int avg = total / arr.size();

    return avg;
}
```

Funkcija kas aprēķina un atgriež masīva vidējo vērtību

```java
public static void printArr(ArrayList<Integer> arr) {
    System.out.println("Initial array: ");
    System.out.println(arr);

    int avg = getAvg(arr);
    System.out.println("Average of array elements is " + avg);

    ArrayList<Integer> modArr = arr;

    for (int i = 0; i < modArr.size(); i++) {
        int mai = modArr.get(i);

        if (mai < 0) {
            modArr.set(i, avg);
        }
    }

    System.out.println("Modified array: ");
    System.out.println(modArr);
}
```

Funkcija, kas no argumentiem saņem masīvu arr, to izprintē un izmantojot iepriekš definētu funkciju aprēķina tā vidējo aritmētisko.

```java
ArrayList<Integer> modArr = arr;

for (int i = 0; i < modArr.size(); i++) {
    int mai = modArr.get(i);

    if (mai < 0) {
        modArr.set(i, avg);
    }
}

System.out.println("Modified array: ");
System.out.println(modArr);
```

Tiek definēts jauns masīvs modArr - modified array, kas vienāds ar masīvu arr

Ejot pāri modArr ar for loop vērtības tiek pielīdzinātas nullei, un ja vērtība mazāka par 0, tad tā tiek aizvietota ar vidējo masīva arr vērtību 

```java
public static ArrayList<Integer> genArr(int len) {
    ArrayList<Integer> arr = new ArrayList<Integer>();

    for (int i = 0; i < len; i++) {
        int randNr = generateRandomBetween(-100, 100);

        arr.add(randNr);
    }

    return arr;
}
```

Funkcija, kas argumentos saņem masīva izmēru "len" izveido jaunu masīvu arr. Kamēr i < masīva izmērs, masīvam arr tiek pievienots nejaušs skaitlis, kurš iegūts izmantojot iepriekš definētu funkciju "generateRandomBetween".

```java
public static int getLen() {
    System.out.print("Enter array length: ");

    int n = 0;

    String nStr = in.next();

    boolean valid = false;

    while (!valid) {
        try {
            n = Integer.parseInt(nStr);

            if (n > 0) {
                valid = true;
            } else {
                System.out.print("Invalid integer, try again: ");
                nStr = in.next();
            }
        } catch (NumberFormatException e) {
            System.out.print("Invalid integer, try again: ");
            nStr = in.next();
        }
    }

    return n;
}
```

Funkcija, kas lietotājam liek ievadīt masīva izmēru.

```java
boolean valid = false;

while (!valid) {
    try {
        n = Integer.parseInt(nStr);

        if (n > 0) {
            valid = true;
        } else {
            System.out.print("Invalid integer, try again: ");
            nStr = in.next();
        }
    } catch (NumberFormatException e) {
        System.out.print("Invalid integer, try again: ");
        nStr = in.next();
    }
}
```

Sākumā "valid" ir false, lai uzsāktu while loop, kurā lietotāja ievadīto izmēru mēģina pārvērst par ciparu, ja tas neizdodas, lietotājam masīva izmēru liek ievadīt vēlreiz. Ja izdodas ievadīto masīva izmēru pārvērst par skaitli, un tas skaitlis ir lielāks par 0, while loops beidzas un tiek atgriezta lietotāja ievadītais masīva izmērs.

```java
public static void main(String[] args) {
    int n = getLen();

    ArrayList<Integer> arr = genArr(n);

    printArr(arr);

    in.close();
}
```

Galvenā funkcija, kas izsauc pārējās.

#### Rezultāts:
![image](https://user-images.githubusercontent.com/62758448/193739393-6fd024f0-28a3-496f-9908-b619c1082215.png)

### 3 uzdevums

#### Nosacījumi:
Sastādīt programmu, kas paredzēta divdimensiju masīva apstrādei. Kādā programmā paredzēt
masīva aizpildes veida (ar nejaušiem skaitļiem diapazonā -100…100 vai ar patstāvīgi ievadītiem
elementiem) izvēles iespēju. Masīvu nodod funkcijai, kas paredzēta masīva apstrādei: samainīt
vietām matricas kolonnas, kas satur minimālo un maksimālo elementus. 

#### kods:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

class Main {
    public static Scanner in = new Scanner(System.in);

    public static int generateRandomBetween(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        return randomNum;
    }

    public static ArrayList<ArrayList<Integer>> enterArr() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();

            for (int j = 0; j < 5; j++) {
                System.out.print("Enter [" + i + ";" + j + "] element: ");
                String nStr = in.next();
                boolean valid = false;
                int el = 0;

                while (!valid) {
                    try {
                        el = Integer.parseInt(nStr);

                        valid = true;
                    } catch (NumberFormatException e) {
                        System.out.print("Invalid integer, enter [" + i + ";" + j + "] element again: ");
                        nStr = in.next();
                    }
                }

                row.add(el);
            }

            arr.add(row);
        }

        return arr;
    }

    public static ArrayList<ArrayList<Integer>> autoArr() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 5; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();

            for (int j = 0; j < 5; j++) {
                int randNr = generateRandomBetween(-100, 100);

                row.add(randNr);
            }

            arr.add(row);
        }

        return arr;
    }

    public static ArrayList<ArrayList<Integer>> getArr() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        System.out.println("Do you want to create your own array?");
        System.out.println("y [yes]");
        System.out.println("n [no]");

        String choice = in.nextLine();

        if (choice.toLowerCase().equals("y")) {
            arr = enterArr();
        } else {
            arr = autoArr();
        }

        return arr;
    }

    public static void printArr(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> row = arr.get(i);

            String fArrRow = "";

            for (int j = 0; j < row.size(); j++) {
                int rowInt = row.get(j);

                if (j > 0) {
                    fArrRow += " ";
                }

                if (rowInt >= 0) {
                    fArrRow += " ";

                    if (rowInt < 10) {
                        fArrRow += " ";
                    }
                } else if (rowInt > -10) {
                    fArrRow += " ";
                }

                fArrRow += String.valueOf(rowInt);
            }

            System.out.println(fArrRow);
        }
    }

    public static void fun(ArrayList<ArrayList<Integer>> arr) {
        int maxVal, minVal, maxJ, minJ;

        maxJ = 0;
        minJ = 0;

        maxVal = 777;
        minVal = 777;

        System.out.println("Original array: ");
        printArr(arr);

        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> row = arr.get(i);

            for (int j = 0; j < row.size(); j++) {
                int val = row.get(j);

                if (minVal == 777) {
                    minVal = val;
                    minJ = j;
                } else if (val < minVal) {
                    minVal = val;
                    minJ = j;
                }

                if (maxVal == 777) {
                    maxVal = val;
                    maxJ = j;
                } else if (val > maxVal) {
                    maxVal = val;
                    maxJ = j;
                }
            }
        }

        if (minJ != maxJ) {
            ArrayList<ArrayList<Integer>> rtrnArr = new ArrayList<ArrayList<Integer>>();

            for (int i = 0; i < arr.size(); i++) {
                ArrayList<Integer> nRow = new ArrayList<Integer>();
                ArrayList<Integer> row = arr.get(i);

                for (int j = 0; j < row.size(); j++) {
                    int ma = row.get(maxJ);
                    int mi = row.get(minJ);
                    int n = row.get(j);

                    if (j == minJ) {
                        nRow.add(ma);
                    } else if (j == maxJ) {
                        nRow.add(mi);
                    } else {
                        nRow.add(n);
                    }
                }

                rtrnArr.add(nRow);
            }

            System.out.println("Min value: " + minVal);
            System.out.println("Max value: " + maxVal);

            System.out.println("New array: ");
            printArr(rtrnArr);
        } else {
            System.out.println("Min value: " + minVal);
            System.out.println("Max value: " + maxVal);
            System.out.println("MAX and MIN value are in the same column");

            System.out.println("New array: ");
            printArr(arr);
        }

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = getArr();

        fun(arr);

        in.close();
    }
}
```

#### Paskaidrojums:

```java
public static Scanner in = new Scanner(System.in);
```

Tiek definēts skeneris - input

```java
public static int generateRandomBetween(int min, int max) {
    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

    return randomNum;
}
```

Funkcija, kas ģenerē nejaušu skaitli starp minimālo un maksimālo argumentu

```java
public static ArrayList<ArrayList<Integer>> enterArr() {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i < 5; i++) {
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int j = 0; j < 5; j++) {
            System.out.print("Enter [" + i + ";" + j + "] element: ");
            String nStr = in.next();
            boolean valid = false;
            int el = 0;

            while (!valid) {
                try {
                    el = Integer.parseInt(nStr);

                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.print("Invalid integer, enter [" + i + ";" + j + "] element again: ");
                    nStr = in.next();
                }
            }

            row.add(el);
        }

        arr.add(row);
    }

    return arr;
}
```

Funkcija, kas lietotājam liek ievadīt 5x5 divdimensiju masīvu. 

```java
for (int i = 0; i < 5; i++) {
    ArrayList<Integer> row = new ArrayList<Integer>();

    for (int j = 0; j < 5; j++) {
        System.out.print("Enter [" + i + ";" + j + "] element: ");
        String nStr = in.next();
        boolean valid = false;
        int el = 0;

        while (!valid) {
            try {
                el = Integer.parseInt(nStr);

                valid = true;
            } catch (NumberFormatException e) {
                System.out.print("Invalid integer, enter [" + i + ";" + j + "] element again: ");
                nStr = in.next();
            }
        }

        row.add(el);
    }

    arr.add(row);
}
```

Kamēr i < 5 tiek uzsākts vēl viens for loop, kurā lietotājs ievada elementa vērtību.

```java
boolean valid = false;

while (!valid) {
    try {
        el = Integer.parseInt(nStr);

        valid = true;
    } catch (NumberFormatException e) {
        System.out.print("Invalid integer, enter [" + i + ";" + j + "] element again: ");
        nStr = in.next();
    }
}

row.add(el);
```

Sākumā "valid" ir false, lai uzsāktu while loop, kurā lietotāja ievadīto elementu mēģina pārvērst par ciparu, ja tas neizdodas, elementu liek ievadīt vēlreiz. Ja izdodas ievadīto elementu pārvērst par skaitli, while loops beidzas un rindai tiek pievienots ievadītais elements.

```java
return arr;
```

Kad masīvs ievadīts, tas tiek atgriezts kā divdimensiju ciparu masīvs.

```java
public static ArrayList<ArrayList<Integer>> autoArr() {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i < 5; i++) {
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int j = 0; j < 5; j++) {
            int randNr = generateRandomBetween(-100, 100);

            row.add(randNr);
        }

        arr.add(row);
    }

    return arr;
}
```

Funkcija, kas automātiski aizpilda 5x5 divdimensiju masīvu.

```java
ArrayList<Integer> row = new ArrayList<Integer>();

for (int j = 0; j < 5; j++) {
    int randNr = generateRandomBetween(-100, 100);

    row.add(randNr);
}

arr.add(row);
```

Otrajā for loop tiek ģenerēts random skaitlis no -100 līdz 100 izmantojot iepriekš definēto funkciju "generateRandomBetween". Ģenerēto skaitli pievieno rindai, un kad for loop beidzas, rindu pievieno "arr" masīvam, veidojot divdimensiju masīvu.

```java
public static ArrayList<ArrayList<Integer>> getArr() {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

    System.out.println("Do you want to create your own array?");
    System.out.println("y [yes]");
    System.out.println("n [no]");

    String choice = in.nextLine();

    if (choice.toLowerCase().equals("y")) {
        arr = enterArr();
    } else {
        arr = autoArr();
    }

    return arr;
}
```

Funkcija, kas ļauj lietotājam izvēlēties vai manuāli rakstīt masīvu, vai automātiski izveidot. Ja lietotājs izvēlas "y" atbildi, tad tiek izsaukta iepriekš definētā "enterArr" funkcija, kura liek masīvu ievadīt manuāli. Ja izvēle nav "y", tad masīvs tiek automātiski izveidots izmantojott iepriekš definēto "autoArr" funkciju.

Kad masīvs izveidots, funkcija to atgriež.

```java
public static void printArr(ArrayList<ArrayList<Integer>> arr) {
    for (int i = 0; i < arr.size(); i++) {
        ArrayList<Integer> row = arr.get(i);

        String fArrRow = "";

        for (int j = 0; j < row.size(); j++) {
            int rowInt = row.get(j);

            if (j > 0) {
                fArrRow += " ";
            }

            if (rowInt >= 0) {
                fArrRow += " ";

                if (rowInt < 10) {
                    fArrRow += " ";
                }
            } else if (rowInt > -10) {
                fArrRow += " ";
            }

            fArrRow += String.valueOf(rowInt);
        }

        System.out.println(fArrRow);
    }
}
```

Funkcija, kas paredzēta masīva noformēšanai pirms tā printēšanas.

```java
public static void fun(ArrayList<ArrayList<Integer>> arr) {
    int maxVal, minVal, maxJ, minJ;

    maxJ = 0;
    minJ = 0;

    maxVal = 777;
    minVal = 777;

    System.out.println("Original array: ");
    printArr(arr);

    for (int i = 0; i < arr.size(); i++) {
        ArrayList<Integer> row = arr.get(i);

        for (int j = 0; j < row.size(); j++) {
            int val = row.get(j);

            if (minVal == 777) {
                minVal = val;
                minJ = j;
            } else if (val < minVal) {
                minVal = val;
                minJ = j;
            }

            if (maxVal == 777) {
                maxVal = val;
                maxJ = j;
            } else if (val > maxVal) {
                maxVal = val;
                maxJ = j;
            }
        }
    }

    if (minJ != maxJ) {
        ArrayList<ArrayList<Integer>> rtrnArr = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> nRow = new ArrayList<Integer>();
            ArrayList<Integer> row = arr.get(i);

            for (int j = 0; j < row.size(); j++) {
                int ma = row.get(maxJ);
                int mi = row.get(minJ);
                int n = row.get(j);

                if (j == minJ) {
                    nRow.add(ma);
                } else if (j == maxJ) {
                    nRow.add(mi);
                } else {
                    nRow.add(n);
                }
            }

            rtrnArr.add(nRow);
        }

        System.out.println("Min value: " + minVal);
        System.out.println("Max value: " + maxVal);

        System.out.println("New array: ");
        printArr(rtrnArr);
    } else {
        System.out.println("Min value: " + minVal);
        System.out.println("Max value: " + maxVal);
        System.out.println("MAX and MIN value are in the same column");

        System.out.println("New array: ");
        printArr(arr);
    }
}
```

Galvenā funkcija, kas apstrādā masīvu, kuru saņem argumentos.

```java
maxVal = 777;
minVal = 777;
```

Maksimālajam un minimālajam mainīgajam tiek iedota neiespējama vērtība, lai vēlāk saprastu vai tie jau mainīti.

```java
for (int i = 0; i < arr.size(); i++) {
    ArrayList<Integer> row = arr.get(i);

    for (int j = 0; j < row.size(); j++) {
        int val = row.get(j);

        if (minVal == 777) {
            minVal = val;
            minJ = j;
        } else if (val < minVal) {
            minVal = val;
            minJ = j;
        }

        if (maxVal == 777) {
            maxVal = val;
            maxJ = j;
        } else if (val > maxVal) {
            maxVal = val;
            maxJ = j;
        }
    }
}
```

Šis for loop atrod minimālo un maksimālo masīva vērtību un to rindas indeksus.

```java
if (minJ != maxJ) {
    ArrayList<ArrayList<Integer>> rtrnArr = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i < arr.size(); i++) {
        ArrayList<Integer> nRow = new ArrayList<Integer>();
        ArrayList<Integer> row = arr.get(i);

        for (int j = 0; j < row.size(); j++) {
            int ma = row.get(maxJ);
            int mi = row.get(minJ);
            int n = row.get(j);

            if (j == minJ) {
                nRow.add(ma);
            } else if (j == maxJ) {
                nRow.add(mi);
            } else {
                nRow.add(n);
            }
        }

        rtrnArr.add(nRow);
    }

    System.out.println("Min value: " + minVal);
    System.out.println("Max value: " + maxVal);

    System.out.println("New array: ");
    printArr(rtrnArr);
} else {
    System.out.println("Min value: " + minVal);
    System.out.println("Max value: " + maxVal);
    System.out.println("MAX and MIN value are in the same column");

    System.out.println("New array: ");
    printArr(arr);
}
```

Ja minimālie un maksimālie rindu indeksi sakrīt, tad sanāk ka tie atrodas vienā rindā. Ja tie nesakrīt: 

```java
ArrayList<ArrayList<Integer>> rtrnArr = new ArrayList<ArrayList<Integer>>();

for (int i = 0; i < arr.size(); i++) {
    ArrayList<Integer> nRow = new ArrayList<Integer>();
    ArrayList<Integer> row = arr.get(i);

    for (int j = 0; j < row.size(); j++) {
        int ma = row.get(maxJ);
        int mi = row.get(minJ);
        int n = row.get(j);

        if (j == minJ) {
            nRow.add(ma);
        } else if (j == maxJ) {
            nRow.add(mi);
        } else {
            nRow.add(n);
        }
    }

    rtrnArr.add(nRow);
}

System.out.println("Min value: " + minVal);
System.out.println("Max value: " + maxVal);

System.out.println("New array: ");
printArr(rtrnArr);
```

Tiek izveidots jauns divdimensiju masīvs "rtrnArr", un ejot pāri argumentu masīvam "arr" ar for loop:

```java
ArrayList<Integer> row = arr.get(i);

for (int j = 0; j < row.size(); j++) {
    int ma = row.get(maxJ);
    int mi = row.get(minJ);
    int n = row.get(j);

    if (j == minJ) {
        nRow.add(ma);
    } else if (j == maxJ) {
        nRow.add(mi);
    } else {
        nRow.add(n);
    }
}

rtrnArr.add(nRow);
```

Tiek iegūta rinda un tai ejot pāri ar for loop tiek iegūtas rindas elementu vērtības. Ja j indekss sakrīt ar minimālo j indeksu, rindai tiek pievienots maksimālais arr[j] elements. Ja j indekss sakrīt ar maksimālo j indeksu, rindai tiek pievienots minimālais arr[j] elements. Ja j nesakrīt ne ar vienu indeksu, tad rindai tiek pievienots arr[j] elements

```java
public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> arr = getArr();

    fun(arr);

    in.close();
}
```

Galvenā funkcija, kas izsauc pārējās.

#### Rezultāts:
![image](https://user-images.githubusercontent.com/62758448/193749427-e9cd9d85-cd35-4ce8-923b-d3644ba2ac2f.png)


## Secinājumi

Hipotēze daļēji piepildījās. Ieguvu jaunas zināšanas Java valodā, bet nācās saskarties ar uzmanības kļūdām, kurās sajaucu mainīgo nosaukumus, kā rezultātā nesanāca pareizs aprēķins. Uzskatu šo praktisko darbu par veiksmīgu.

## Izmantotie resursi
- [What is Java used for?](https://www.futurelearn.com/info/blog/what-is-java-used-for#:~:text=Developers%20use%20Java%20to%20construct,cell%20phones%2C%20and%20other%20devices.&text=Java%20is%20the%20world's%20third,which%20evaluates%20programming%20language%20popularity.)
- [Java programmēšanas valoda](https://lv.wikipedia.org/wiki/Java_(programm%C4%93%C5%A1anas_valoda))
- [How does the Java compiler work?](https://www.quora.com/How-does-the-Java-compiler-work)

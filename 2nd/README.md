## 2 uzdevums

### Nosacījumi:
Sastādīt programmu, kas paredzēta viendimensijas masīva apstrādei. Aizpildīt reālo skaitļu masīvu ar n nejaušiem skaitļiem diapazonā -100...100. Izmantojot funkciju printArr() izprintēt uz ekrāna masīvu. Masīvā aizvietot visus negatīvus elementus ar vidējo aritmētisko masīva elementu vērtību.

### kods:

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

### Paskaidrojums:

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

### Rezultāts:


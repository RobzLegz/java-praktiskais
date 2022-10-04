## 3 uzdevums

### Nosacījumi:
Sastādīt programmu, kas paredzēta divdimensiju masīva apstrādei. Kādā programmā paredzēt
masīva aizpildes veida (ar nejaušiem skaitļiem diapazonā -100…100 vai ar patstāvīgi ievadītiem
elementiem) izvēles iespēju. Masīvu nodod funkcijai, kas paredzēta masīva apstrādei: samainīt
vietām matricas kolonnas, kas satur minimālo un maksimālo elementus. 

### kods:

```java
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

### Rezultāts:


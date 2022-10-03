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

        if (minJ == maxJ) {
            System.out.println("MAX and MIN value are in the same column");
        }

        System.out.println("New array: ");
        printArr(rtrnArr);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = getArr();

        fun(arr);

        in.close();
    }
}

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

        for (int i = 0; i < arr.size(); i ++){
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

        for (int i = 0; i < modArr.size(); i ++){
            int mai = modArr.get(i);

            if(mai < 0){
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

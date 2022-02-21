import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int arraySize = reader.nextInt();
        int arraySize2 = reader.nextInt();
        int[] firstArray = new int[arraySize];
        int[] secondArray = new int[arraySize2];

        System.out.println("Please enter " + arraySize + " numbers: ");

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print("firstArray[" + i + "] = ");
            firstArray[i] = reader.nextInt();
        }
        System.out.println("Please enter " + arraySize2 + " numbers: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("secondArray[" + i + "] = ");
            secondArray[i] = reader.nextInt();
        }

        int smallerNumber;
        int biggerNumber;
        if (arraySize > arraySize2) {
            biggerNumber = arraySize;
            smallerNumber = arraySize2;
        } else {
            biggerNumber = arraySize2;
            smallerNumber = arraySize;
        }


        int[] third = new int[biggerNumber];

        for (int i = 0; i < third.length; i++) {

            if (i < smallerNumber) {
                third[i] = firstArray[i] + secondArray[i];
            } else if (firstArray.length == biggerNumber) {
                third[i] = firstArray[i];
            } else {
                third[i] = secondArray[i];
            }
        }
        System.out.println(Arrays.toString(third));
    }
}

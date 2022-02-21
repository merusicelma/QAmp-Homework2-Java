import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter array size: ");
        int arraySize = reader.nextInt();
        int[] numberArray = new int[arraySize];

        System.out.println("Please enter " + arraySize + " numbers: ");

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("numberArray[" + i + "] = ");
            numberArray[i] = reader.nextInt();
        }

        System.out.println("Reverse array: ");
        for (int i = numberArray.length - 1; i >= 0; i--) {
            System.out.println("numberArray[" + i + "] = " + numberArray[i]);
        }

    }

}

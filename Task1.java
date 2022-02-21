import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter array size: ");
        int arraySize = reader.nextInt();
        int[] numberArray = new int[arraySize];

        System.out.println("Please enter " + arraySize + " numbers: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("Number array " + (i + 1) + ":");
            numberArray[i] = reader.nextInt();
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i]);
            if (numberArray[i] % 2 == 0) {
                System.out.print(", is even");
            }
            if (numberArray[i] > 10) {
                System.out.print(", is greater then 10");
            }
            System.out.println();

        }


    }
}

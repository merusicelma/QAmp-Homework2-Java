import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int firstSize = reader.nextInt();
        int secondSize = reader.nextInt();
        int[] firstArray = new int[firstSize];
        int[] secondArray = new int[secondSize];

        System.out.println("Please enter" + firstSize + "numbers: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print("firstArray[" + i + "] = ");
            firstArray[i] = reader.nextInt();

        }
        System.out.println("Please enter" + secondSize + "numbers: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print("secondArray[" + i + "] = ");
            secondArray[i] = reader.nextInt();

        }

        int[] third = new int[firstSize + secondSize];
        int index = 0;

        for (int i = 0; i < firstArray.length; i++) {
            third[index++] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            third[index++] = secondArray[i];
        }


    }
}

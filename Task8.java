import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Please enter array size: ");
        int arraySize = Integer.parseInt(reader.nextLine());
        String[] stringArray = new String[arraySize];

        System.out.println("Please enter " + arraySize + " strings: ");

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = reader.nextLine();
        }

        System.out.println("Elements which have vowels are: ");

        String[] filterArray = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};


        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < filterArray.length; j++) {
                if (stringArray[i].contains(filterArray[j])) {
                    System.out.println(stringArray[i]);
                    break;
                }
            }

        }
    }
}
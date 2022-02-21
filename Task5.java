import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter lower number in range: ");
        int lowerNumber = reader.nextInt();
        System.out.println("Please enter larger number in range:");
        int largerNumber = reader.nextInt();
        System.out.println("Even numbers for range " + lowerNumber + " to " + largerNumber + " are:");


        for (int i = lowerNumber + 1; i < largerNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}

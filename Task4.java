import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("PLease enter some word: ");
        String someWord = reader.nextLine();


        char[] charArray = someWord.toCharArray();

        boolean isPalindrom = true;

        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) {
                isPalindrom = false;
            }
        }

        if (isPalindrom) {
            System.out.println("Word " + someWord + " is palindrom.");
        } else {
            System.out.println("Word " + someWord + " is not palindrom.");
        }


    }
}

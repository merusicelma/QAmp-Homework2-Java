public class Task2 {
    public static void main(String[] args) {


        int[] numberArray2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        String[] stringArray = {"First number in array: ", "Second number in array: ", "Third number in array: ", "Fourth number in array: ", "Fifth number in array: ", "Sixth number in array: ", "Seventh number in array: ", "Eighth number in array: ", "Ninth number in array: ", "Tenth number in array: "};

        System.out.println("Numbers in array ");
        for (int i = 0; i <= numberArray2.length - 1; i++) {
            System.out.println(stringArray[i] + numberArray2[i]);
        }

    }
}

import java.util.Scanner;

public class MoneyBill {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the amount of money you pay: ");
        int money = reader.nextInt();
        if (money > 100) {
            System.out.println("You have too much money. ");
            return;
        }

        System.out.println("Please enter amount of bill: ");
        int bill = reader.nextInt();

        if (bill == 0) {
            System.out.println("You didn't buy anything did you? ");
            return;
        }
        if (bill < 0) {
            System.out.println("Did you maybe break something? ");
            return;
        }
        if (money < bill) {
            System.out.println("Bill is bigger then money!");
            return;
        }
        int change = money - bill;


        System.out.println("Change is: " + change);
        int twenty = 20;
        int tens = 10;
        int two = 2;
        int one = 1;


        int noOfTwenties = change / twenty;
        change = change - (noOfTwenties * twenty);

        int noOfTens = change / tens;
        change = change - (noOfTens * tens);

        int noOfTwo = change / two;
        change = change - (noOfTwo * two);

        int noOfOne = change / one;
        change = change - (noOfOne * one);


        System.out.println("Amount of " + twenty + " is: " + noOfTwenties);
        System.out.println("Amount of " + tens + " is: " + noOfTens);
        System.out.println("Amount of " + two + " is: " + noOfTwo);
        System.out.println("Amount of " + one + " is: " + noOfOne);


    }

}
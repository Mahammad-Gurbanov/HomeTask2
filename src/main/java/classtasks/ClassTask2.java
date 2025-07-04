package classtasks;

import java.util.Scanner;

public class ClassTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 1: Ice Cream Shop
        System.out.println("Enter the price for the first scoop of ice cream:" +
                " ");
        double firstPrice = scanner.nextDouble();

        System.out.println("Enter the price for the second scoop of ice " +
                "cream: ");
        double secondPrice = scanner.nextDouble();

        double total = firstPrice + secondPrice, product =
                firstPrice * secondPrice, remainder = firstPrice % secondPrice;

        System.out.println("The total price is: " + total);
        System.out.println("The product of both prices is: " + product);
        System.out.println("The remainder when the first price is divided by " +
                "the second is: " + remainder);

        // Task 2: Shopping Cart
        System.out.println("Enter the price for the first product: ");
        int price1 = scanner.nextInt();

        System.out.println("Enter the price for the second product: ");
        int price2 = scanner.nextInt();

        System.out.println("Enter the price for the third product: ");
        int price3 = scanner.nextInt();

        int totalPrice = price1 + price2 + price3;
        float avgPrice = (float) totalPrice / 3;

        int productAll = price1 * price2 * price3;

        System.out.println("The total price is: " + totalPrice);
        System.out.println("The average of the three prices is: " + avgPrice);
        System.out.println("The product of all prices is: " + productAll);

        // Task 3:  The Coffee Budget Crisis
        System.out.println("How many cups of coffee are consumed per day? ");
        int numberOfCups = scanner.nextInt();

        System.out.println("What is the cost per cup? ");
        double cupPrice = scanner.nextDouble();

        double monthlyCost = numberOfCups * cupPrice * 30;
        int cupPerEmployee = numberOfCups / 5;

        System.out.println("After a close examination we have found that, " +
                "employees have been drinking a whopping " + numberOfCups + " " +
                "cups of coffee in a day. That means, on average, each " +
                "employee" + " is drinking " + cupPerEmployee + " cups of coffee a day. " +
                "This costs us " + monthlyCost + "$ per month, which is a " +
                "lot. So, " + "please drink less coffee try some tea instead.");

        scanner.close();
    }
}

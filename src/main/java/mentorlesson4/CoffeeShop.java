package mentorlesson4;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        // Apply discount based on age
        // children under 12 get a free drink, teenagers get a student discount, senior citizens get another discount.
        if (age < 12) {
            System.out.println("You get a free drink");
        } else if (12 < age && age < 20) {
            System.out.println("You get a student discount");
        } else if (age < 60) {
            System.out.println("Sorry but you are not eligible for a discount");
        } else {
            System.out.println("You get a senior citizen discount");
        }

        // Display Menu
        System.out.println("\nOur Menu:");
        System.out.println("1. Espresso – A strong, concentrated shot of coffee.");
        System.out.println("2. Americano – Espresso diluted with hot water.");
        System.out.println("3. Latte – Espresso with lots of steamed milk and a little foam.");
        System.out.println("4. Cappuccino – Equal parts espresso, steamed milk, and foam.");
        System.out.println("5. Macchiato – Espresso with a small amount of milk or foam.");
        System.out.println("6. Mocha – Espresso mixed with chocolate syrup and steamed milk.");
        System.out.println("7. Flat White – Similar to a latte but with less foam and more microfoam texture.");
        System.out.println("8. Cortado – Equal parts espresso and warm milk to reduce acidity.");
        System.out.println("9. Cold Brew – Coffee brewed slowly in cold water for 12–24 hours.");
        System.out.println("10. Affogato – A scoop of vanilla ice cream topped with a shot of hot espresso.");

        System.out.println("\nPlease enter the number of the coffee you want " +
                "from our menu:");
        while (true) {
            int menuChoice = scanner.nextInt();
            String coffee = switch (menuChoice) {
                case 1 -> "Espresso";
                case 2 -> "Americano";
                case 3 -> "Latte";
                case 4 -> "Cappuccino";
                case 5 -> "Macchiato";
                case 6 -> "Macho";
                case 7 -> "Flat White";
                case 8 -> "Cortado";
                case 9 -> "Cold Brew";
                case 10 -> "Affogato";
                default -> "Invalid choice";

            };
            if (coffee.equals("Invalid choice")) {
                System.out.println(coffee + ", please choose a number from " +
                        "above list (1-10)");
            } else {
                System.out.println("One cup of " + coffee + " is being made");
                break;
            }

        }
    }
}

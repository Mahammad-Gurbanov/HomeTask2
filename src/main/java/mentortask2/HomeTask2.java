package mentortask2;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1 : Alien Juice Calculator
        System.out.println("Amount of banana juice in ml: ");
        int bananaJuice = scanner.nextInt();

        System.out.println("Amount of cactus juice in ml: ");
        int cactusJuice = scanner.nextInt();

        int totalVolume = bananaJuice + cactusJuice;
        int numGlasses = totalVolume / 250;

        System.out.println("Whoa! That makes " + totalVolume + " ml of cosmic " +
                "juice! Enough to fill " + numGlasses + " full glasses!");

        // Task 2: Office Supplies Audit
        System.out.println("Enter the number of pens you have: ");
        int penCount = scanner.nextInt();

        System.out.println("Enter the number of papers you have: ");
        int paperCount = scanner.nextInt();

        System.out.println("Enter the number of markers you have: ");
        int markerCount = scanner.nextInt();

        int totalItems = penCount + paperCount + markerCount;
        boolean isAllMoreThan10 =
                penCount > 10 && paperCount > 10 && markerCount >10;

        float penPercentage = (float) penCount / totalItems * 100;
        float paperPercentage = (float) paperCount / totalItems * 100;
        float markerPercentage = (float) markerCount / totalItems * 100;
//
//        // Round Numbers
        penPercentage = (float) Math.round(penPercentage * 100) / 100;
        paperPercentage = (float) Math.round(paperPercentage * 100) / 100;
        markerPercentage = (float) Math.round(markerPercentage * 100) / 100;

        System.out.println("Are all items more than 10? " + isAllMoreThan10);
        System.out.println("Items and their stock percentages:");
        System.out.println("Pen: " + penPercentage + "%");
        System.out.println("Paper: " + paperPercentage + "%");
        System.out.println("Marker: " + markerPercentage + "%");

        // Task 3: Annual Salary Simulation
        System.out.println("Enter your monthly salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Read the enter \n character as input so name
        // can be inputted

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        double annualSalary = salary * 12;
        double bonus = annualSalary / 10;
        double totalSalary = annualSalary + bonus;
        boolean isMoreThanMillion = totalSalary > 1_000_000;

        System.out.println(name + ", your annual salary is " + annualSalary +
                "$");
        System.out.println("Your total salary with bonuses is " + totalSalary + "$");
        System.out.println("Is your total salary more than a million? " + isMoreThanMillion);

        System.out.println("Considering your salary and workplace, are you " +
                "happy?(Answer with true/false) ");
        boolean isHappy = scanner.nextBoolean();
        System.out.println("Is " + name + " happy? " + isHappy);

        scanner.close();
    }

}

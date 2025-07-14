package mentorlesson7;

import java.util.Scanner;

public class CarSystem {
    public static void main(String[] args) {
        Manufacturer porscheManufacturer = new Manufacturer("Porsche AG",
                1931, "Germany");
        Manufacturer bmwManufacturer = new Manufacturer("Bayerische Motoren " +
                "Werke AG", 1916, "Germany");
        Manufacturer toyotaManufacturer = new Manufacturer("Toyota", 1937,
                "Japan");

        Car bmwF30 = new Car("BMW F30", bmwManufacturer, 2017, 2.0F, "Diesel",
                12000);
        Car porscheCayenne = new Car("Porsche Cayenne", porscheManufacturer,
                2017, 3.0F, "Diesel", 55000);
        Car porscheGt3 = new Car("Porsche 911 GT3", porscheManufacturer, 2022
                , 4.0F, "premium Gasoline", 224495);
        Car  bmwE34 = new Car("BMW E34", bmwManufacturer, 1990, 3.5F,
                "Gasoline", 7000);
        Car toyotaCorolla = new Car("Corolla", toyotaManufacturer, 2020, 1.8F
                , "Gasoline", 23500);

        Manufacturer[] manufacturers = {bmwManufacturer, porscheManufacturer,
                toyotaManufacturer};
        Car[] cars = {bmwE34, porscheCayenne, bmwF30, porscheGt3, toyotaCorolla};

        // Display Manufacturer Info
        System.out.println("=== Manufacturer Info === ");
        for (Manufacturer manufacturer : manufacturers) {
            System.out.println(manufacturer);
        }

        System.out.println();

        // Display Car Catalog
        System.out.println("=== Car Catalog ===");
        for (Car car: cars) {
            System.out.println(car);
        }

        System.out.println();

        // Display Diesel Cars
        System.out.println("=== Diesel Cars ===");
        for (Car car: cars) {
            if (car.getFuelType().equals("Diesel")) {
                System.out.println(car);
            }
        }

        System.out.println();

        // Display German Manufacturer Cars
        System.out.println("=== German Manufacturer Cars ===");
        for (Car car : cars) {
            Manufacturer manufacturer = car.getManufacturer();
            if (manufacturer.getCountry().equals("Germany")) {
                System.out.println(car);
            }
        }

        System.out.println();

        // Bonus Tasks
        // Display Luxury Cars
        System.out.println("=== Luxury Cars ===");
        for (Car car : cars) {
            if (car.isLuxury()) {
                System.out.println(car);
            }
        }

        System.out.println();

        // Find the most expensive var
        Car mostExpensiveCar = cars[0];
        for (Car car: cars) {
            if (mostExpensiveCar.getPrice() < car.getPrice()) {
                mostExpensiveCar = car;
            }
        }
        System.out.println("=== The Most Expensive Car ===");
        System.out.println(mostExpensiveCar);

        System.out.println();

        // Create Cars by using user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of cars you want to add: ");
        int carNum = sc.nextInt();
        sc.nextLine();

        Car[] userCars = new Car[carNum];

        for (int i = 0; i < carNum; i++) {
            System.out.println("Please enter the car model: ");

            String carModel = sc.nextLine();

            System.out.println("\nPlease enter the production year: ");
            int productionYear = sc.nextInt();

            System.out.println("\nPlease enter the engine size: ");
            float engineSize = sc.nextFloat();
            sc.nextLine();

            System.out.println("\nPlease enter the fuel type: ");
            String fuelType = sc.nextLine();

            System.out.println("\nPlease enter the car price: ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.println("\nPlease enter manufacturer name: ");
            String manufacturerName = sc.nextLine();

            System.out.println("\nPlease enter foundation year of the " +
                    "manufacturer: ");
            int foundationYear = sc.nextInt();
            sc.nextLine();

            System.out.println("\nPlease enter the country where the " +
                    "manufacturer is located: ");
            String country = sc.nextLine();

            // Create Car object
            Car userCar = new Car(carModel,new Manufacturer(manufacturerName,
                    foundationYear, country), productionYear, engineSize,
                    fuelType, price);

            userCars[i] = userCar;
        }

        // Display User Cars
        System.out.println("=== User Cars ===");
        for (Car car: userCars) {
            System.out.println(car);
        }




    }
}

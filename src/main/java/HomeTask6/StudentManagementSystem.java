package HomeTask6;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Data Collection
        System.out.println("Enter the number of students in your class: ");
        int numStudent = scanner.nextInt();
        // Read the empty line from buffer
        scanner.nextLine();
        // Create Arrays
        String[] studentNames = new String[numStudent];
        int[] studentAges = new int[numStudent];
        double[] studentGrades = new double[numStudent];
        char[] letterGrades = new char[numStudent];
        boolean[] didPass = new boolean[numStudent];

        // For loop for storing information
        System.out.println("Students please enter the required information " +
                "one by one");
        for (int i = 0; i < numStudent; i++){
            System.out.println("\nStudent number: " + (i + 1));
            System.out.println("Please enter your name: ");
            String name = scanner.nextLine();
            studentNames[i] = name;

            System.out.println("Please enter your age: ");
            int age = scanner.nextInt();
            studentAges[i] = age;

            System.out.println("Please enter your grade: ");
            double grade = scanner.nextDouble();
            // Reading \n character from buffer
            scanner.nextLine();
            studentGrades[i] = grade;
            // Automatically find the letter grade
            char letterGrade;
            if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else letterGrade = 'F';
            letterGrades[i] = letterGrade;

            boolean passed = grade >= 60;
            didPass[i] = passed;

        }
        // Menu System
        int userChoice;
        do {
            System.out.println("Enter 1 to show all students: ");
            System.out.println("Enter 2 to show statistics: ");
            System.out.println("Enter 3 to search for a student: ");
            System.out.println("Enter 4 to filter by age groups: ");
            System.out.println("Enter 5 to filter by success status: ");
            System.out.println("Enter 6 to sort students by grade: ");
            System.out.println("Enter 0 to exit the menu system: ");
            userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                // Implement features
                case 1:
                    // show all students
                    System.out.println("\n======List of all Students======\n");
                    for (int i = 0; i < numStudent; i++){
                        System.out.println("Info about student number: " + (i+1));
                        displayStudentInfo(i, studentNames, studentAges,
                                studentGrades, letterGrades, didPass);
                        System.out.println();
                    }

                    break;
                case 2:
                    // show statistics

                    // calculate class average
                    double totalGrade = 0;
                    for (double grade : studentGrades) {
                        totalGrade += grade;
                    }
                    double avgGrade = totalGrade / numStudent;

                    // Find highest and lowest grades
                    double lowestGrade = studentGrades[0];
                    double highestGrade = studentGrades[0];
                    for (double grade : studentGrades) {
                        if (grade < lowestGrade) lowestGrade = grade;
                        else if (grade > highestGrade) highestGrade = grade;
                    }

                    // Number of passed and failed students
                    int numPassed = 0, numFailed = 0;
                    for (boolean passed : didPass) {
                        if (passed) numPassed++;
                        else numFailed++;
                    }
                    // Calculate average age
                    int totalAge = 0;
                    for (int age: studentAges){
                        totalAge += age;
                    }
                    double avgAge = (double) totalAge / numStudent;

                    // Display Statistics
                    System.out.println("\n======Statistics of all Students======");
                    System.out.println("Average grade: " + avgGrade);
                    System.out.println("Highest grade: " + highestGrade);
                    System.out.println("Lowest grade: " + lowestGrade);
                    System.out.println("Number of passed students: " + numPassed);
                    System.out.println("Number of failed students: " + numFailed);
                    System.out.println("Average age: " + avgAge + '\n');
                    break;
                case 3:
                    // search students by name
                    System.out.println("Please enter the student's name: ");
                    String targetName = scanner.nextLine();
                    boolean studentFound = false;

                    for (int i = 0; i < numStudent; i++) {
                        String name = studentNames[i];
                        if (name.equalsIgnoreCase(targetName)) {
                            displayStudentInfo(i, studentNames, studentAges,
                                    studentGrades, letterGrades, didPass);
                            System.out.println();
                            studentFound = true;
                        }
                    }
                    if (studentFound) {
                        System.out.println("That was the list of all the " +
                                "students with the name: " + targetName + "\n");
                    } else {
                        System.out.println("There aren't any students with " +
                                "the name: " + targetName + "\n");
                    }

                    break;
                case 4:
                    // filter bu age groups
                    boolean foundAgeGroup = false;
                    System.out.println("Please enter the lower boundary of " +
                            "age: ");
                    int lowerBound = scanner.nextInt();

                    int higherBound;
                    while (true) {
                        System.out.println("Please enter the higher boundary of " +
                                "age: ");
                        higherBound = scanner.nextInt();
                        scanner.nextLine();
                        if (lowerBound < higherBound) break;
                        else System.out.println("Higher boundary must be " +
                                "grater than lower boundary");
                    }

                    for (int i = 0; i < numStudent; i++){
                        if (lowerBound <= studentAges[i] && studentAges[i] <= higherBound) {
                            displayStudentInfo(i, studentNames, studentAges,
                                    studentGrades, letterGrades, didPass);
                            System.out.println();
                            foundAgeGroup = true;
                        }
                    }
                    if (foundAgeGroup) {
                        System.out.println("That is the list of all students " +
                                "in the age group of " + lowerBound + " - " + higherBound + "\n");
                    } else System.out.println("No student in the age group " +
                            "of " + lowerBound + " - " + higherBound + " was " +
                            "found\n");
                    break;
                case 5:
                    // filter by success status
                    boolean foundPassed = false;

                    for (int i = 0; i < numStudent; i++){
                        if (didPass[i]) {
                            displayStudentInfo(i, studentNames, studentAges,
                                    studentGrades, letterGrades, didPass);
                            System.out.println();
                            foundPassed = true;
                        }
                    }
                    if (foundPassed) {
                        System.out.println("That was the list of all the " +
                                "students who have passed");
                    } else System.out.println("Unfortunately, no students " +
                            "passed");
                    break;
                case 6:
                    // sort students by grade
                    System.out.println("Enter lh to sort from lowest to " +
                            "highest: ");
                    System.out.println("Enter hl to sort from highest to " +
                            "lowest: ");

                    String chosenOption = scanner.nextLine();
                    if (chosenOption.equalsIgnoreCase("lh")) {
                        System.out.println("======Students sorted in " +
                                "ascending order======");
                        double[] copyGrades =
                                Arrays.copyOf(studentGrades, numStudent);
                        Arrays.sort(copyGrades);
                        boolean[] used_indices = new boolean[numStudent];

                        for (double grade: copyGrades) {
                            for (int i = 0; i < numStudent; i++) {
                                if (studentGrades[i] == grade && !used_indices[i]) {
                                    displayStudentInfo(i, studentNames, studentAges,
                                            studentGrades, letterGrades, didPass);
                                    used_indices[i] = true;
                                    System.out.println();
                                }
                            }
                        }
                    } else if (chosenOption.equalsIgnoreCase("hl")){
                        System.out.println("======Students sorted in " +
                                "descending order======");
                        // create an array of Double, so I can sort them in
                        // reverse order
                        Double[] copyGrades = new Double[numStudent];
                        for (int i = 0; i < numStudent; i++){
                            copyGrades[i] = studentGrades[i];
                        }

                        // sorting in reverse order
                        Arrays.sort(copyGrades, (a, b) -> Double.compare(b, a));
                        boolean[] used_indices = new boolean[numStudent];

                        for (double grade: copyGrades) {
                            for (int i = 0; i < numStudent; i++) {
                                if (studentGrades[i] == grade && !used_indices[i]) {
                                    displayStudentInfo(i, studentNames, studentAges,
                                            studentGrades, letterGrades, didPass);
                                    System.out.println();
                                    used_indices[i] = true;
                                }
                            }
                        }
                    } else System.out.println("Back to menu");
                    break;
                case 0:
                    System.out.println("Exiting menu system");
                    break;
                default:
                    System.out.println("Invalid input");
            }

        } while(userChoice != 0);
    }
    public static void displayStudentInfo(int index, String[] names,
                                            int[] ages, double[] numGrades,
                                            char[] letterGrades, boolean[] didPass) {
        System.out.println("Name: " + names[index]);
        System.out.println("Age: " + ages[index]);
        System.out.println("Grade: " + numGrades[index]);
        System.out.println("Letter grade: " + letterGrades[index]);
        System.out.println("Did pass? " + didPass[index]);
    }
}

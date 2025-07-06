package mentorlesson5;

import java.util.Scanner;

public class EscapeFromVolcanicIsland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Initialize some variables
            boolean tryAgain = false;
            int energyLevel = 100;
            // Set up a starting scene
            System.out.println("🌊 *Whooosh...* Gentle waves crash against the shore, mingled with distant cries of seagulls echoing in the wind...");
            System.out.println("👁️‍🗨️ Slowly, your eyes begin to open... light pierces through the blur as the world fades into focus.");
            System.out.println("👀 You open your eyes... but what you're seeing can't be real — an island?");
            System.out.println("💭 You must be dreaming. You rub your eyes...");
            System.out.println("🌴 But nothing changes. Reality hits: you've " +
                    "been stranded on an island!!.");
            System.out.println("😱🎶 *DAN!*... *DAN!!*... *DAAAAN!!!*");
            System.out.println("You look to your left... then right... and spot a wooden sign in the distance.");
            System.out.println("☀️ It's best to go to the shade — the sun is " +
                    "scorching, and the longer you stay exposed, the more exhausted you'll become.");
            System.out.println("🌡️ Prolonged sun exposure could lead to sunburn... and worse. You should start walking toward the sign.");
            System.out.println("➡️ To start walking toward the sign, type: Walk");

            String input = scanner.nextLine();
            while (!input.equalsIgnoreCase("walk")) {
                energyLevel -= 10;
                // Finish the game if energy level is less than or equal to zero
                if (energyLevel <= 0) {
                    System.out.println("You've run out of energy... completely drained.");
                    System.out.println("😔 You can no longer move, and there's no way to escape the island.");
                    System.out.println("You're stuck here... forever.");
                    System.out.println("💀 GAME OVER!!");
                    System.out.println("Would you like to try again? (true/false)");
                    tryAgain = scanner.nextBoolean();
                    // Catch \n character in the buffer
                    scanner.nextLine();
                    break;

                }
                // Display message to show the consequences of not walking
                System.out.println("Well, well, well... looks like you ignored my advice.");
                System.out.println("Now you're stuck under the blazing sun, frustrated and sweating.");
                System.out.println("☀️ Your energy has dropped from 100 to " + energyLevel + ".");
                System.out.println("Each time you delay, your energy will decrease by 10.");
                System.out.println("⚠️ If it reaches 0, you won't be able to move... and you'll be stranded here for good.");
                System.out.println("➡️ Start walking by typing: Walk");
                input = scanner.nextLine();
            }

            if (energyLevel <= 0){
                // If the player decides to try again it will start all over
                if (tryAgain) continue;
                // Else the game will stop
                else break;
            }
            // Setting the scene of player walking
            System.out.println("🏖️ You begin walking across the scorching sand...");
            System.out.println("Your feet are burning, and crabs scuttle by as the sun beats down.");
            System.out.println("🌴 Finally, you reach the shade. Now you can continue toward the wooden sign in comfort.");
            System.out.println("🚶‍♂️ Walking... Walking...");
            System.out.println("You’ve arrived at the sign. To read it, type: Read");
            System.out.println("⏳ But remember — time is gold. The longer you delay, the more energy you lose.");
            System.out.println("Each failed attempt will reduce your energy by 5.");


            input = scanner.nextLine();
            while (!input.equalsIgnoreCase("read")) {
                energyLevel -= 5;
                if (energyLevel == 0) {
                    System.out.println("You've run out of energy... completely drained.");
                    System.out.println("😔 You can no longer move, and there's no way to escape the island.");
                    System.out.println("You're stuck here... forever.");
                    System.out.println("💀 GAME OVER!!");
                    System.out.println("Would you like to try again? (true/false)");
                    tryAgain = scanner.nextBoolean();
                    // Catch \n character in the buffer
                    scanner.nextLine();
                    break;
                }
                System.out.println("Your energy level is now " + energyLevel);
                System.out.println("⚠️If it drops to zero, you'll be stranded on this island... forever.");
                System.out.println("So start reading by entering Read:");
                input = scanner.nextLine();

            }
            if (energyLevel <= 0){
                // If the player decides to try again it will start all over
                if (tryAgain) continue;
                    // Else the game will stop
                else break;
            }

            break;



        }
    }
}

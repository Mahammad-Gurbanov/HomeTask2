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
            // The scene which the player reads the wooden sign
            System.out.println("You see a collection of names carved into the wood 🪵");
            System.out.println("Some marked as *Winners*, others as *Losers*.");
            System.out.println(" Below them, one final empty line waits...");
            System.out.println("It's inviting you to carve your name into it.");
            System.out.print("Please enter your name: ");
            String player = scanner.nextLine();


            System.out.println("🤖 *Whirr... Click...*");
            System.out.println("🔊 *Tsssss...* Something is moving beneath the sand...");
            System.out.println("🚨 *POP!* A strange, futuristic-looking tube shoots up from beneath the ground, hissing with steam.");
            System.out.println("Inside, you spot an envelope sealed with a metallic stamp.");

            System.out.println("\nYou're filled with curiosity and questions as you reach for it...");
            System.out.println("📩 You open the envelope and begin to read:\n");

            // Scene where the rules are displayed
            System.out.println("Dear " + player + ",\n");
            System.out.println("You have been chosen to participate in our game: *Escape the Volcanic Island*.");
            System.out.println("This game consists of 4 unique zones, each with its own challenges.");
            System.out.println("🏝️ Complete challenges to earn points — and those points will become money... if you escape.");
            System.out.println("⚠️ But be careful: one mistake means you will lose points in that game.");
            System.out.println("💡 Energy is everything. Without it, you won’t be able to move, complete challenges, or escape.");
            System.out.println("Before each zone begins, you’ll be briefed on the rules.");
            System.out.println("GOOD LUCK... and save as much energy as you can.");

            System.out.println("⬆️ After reading the letter, you notice arrow marks on the ground—");
            System.out.println("They're made from carefully placed stones 🪨, pointing a path forward.");
            System.out.println("You follow them, until you come across another wooden sign pinned to a large rock.");
            System.out.println("It reads: *Zone 1 — Valley of Mathematics*.");
            System.out.println("You step through a narrow entrance, the air growing cooler as you enter the valley..");

            System.out.println("\nAfter about fifteen minutes of walking, you notice a faint carving on the right wall.");
            System.out.println("You approach it, curiosity pulling you in.");

            System.out.println("🧩 It says:");
            System.out.println("\"If you can solve this equation, a secret garage door will open, revealing an ATV.");
            System.out.println("With it, you'll ride past the valley in minutes and earn *10 points*.");
            System.out.println("But if you fail... you’ll be forced to walk the entire path,");
            System.out.println("costing you *90 minutes* and *20 energy points*.");
            System.out.println("Choose wisely.");
            System.out.println("When you find the answer, carve it into the wooden sign.\"");


            System.out.println("\n🧠 You carefully scan the wall... and there it is, etched deep into the stone:");
            System.out.println("The equation: 8 / 2(2 + 2) = ?");
            System.out.print("🔢 Please type your answer: ");

            int playerAnswer = scanner.nextInt();

            if (playerAnswer == 16){
                System.out.println("🔊 *Krrrk... Vrrrrr...* A hidden garage door rumbles open in the side of the mountain.");
                System.out.println("*The ground shakes slightly beneath your feet...*");
                System.out.println("\n✅ Great job! You've solved the equation correctly.");
                System.out.println("🎉 You earn *10 points*, and now you can use the ATV to ride past the valley!");

                System.out.println("\n🛞 You hop into the ATV, a grin on your face, and start the engine.");
                System.out.println("🏞️ As you speed through the valley, the wind rushes past and you admire the beautiful, untouched scenery around you.");

                points += 10;
            } else {
                System.out.println("❌ *BAM! BAM! BAM!* A loud buzzer echoes through the valley...");
                System.out.println("Unfortunately, your answer is incorrect.");
                System.out.println("🚶‍♂️ You’ll have to walk the entire distance on foot.");

                System.out.println("You clench your fists in frustration, wishing you'd gotten it right...");
                System.out.println("But there's no time to dwell — you begin the long walk through the valley.");
                energyLevel -= 20;

                // check if energy level is below and player is frustrated
            }
            if (energyLevel <= 0){
                System.out.println("😓 After a long and frustrating walk, your energy is completely drained.");
                System.out.println("You collapse to the ground — unable to move a muscle.");
                System.out.println("You're stranded on this island... forever.");
                System.out.println("💀 GAME OVER!!");
                System.out.print("Would you like to try again? (true/false): ");

                tryAgain = scanner.nextBoolean();
                // Catch \n character in the buffer
                scanner.nextLine();

                if (tryAgain) continue;
                else break;
            }




            break;



        }
    }
}

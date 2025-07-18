package mentorlesson5;

import java.util.Scanner;

public class EscapeFromVolcanicIsland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gameLoop: while (true) {
            // Initialize some variables
            boolean tryAgain = false;
            int energyLevel = 100;
            int points = 0;
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
            System.out.println("Below them, one final empty line waits...");
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
            scanner.nextLine();

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


            }
            // Check if the game can continue
            if (energyLevel <= 0){
                System.out.println("😓 After a long and frustrating walk, your energy is completely drained.");
                System.out.println("You collapse to the ground — unable to move a muscle.");
                System.out.println("You're stranded on this island... forever.");
                System.out.println("💀 GAME OVER!!");
                System.out.print("Would you like to try again? (true/false): ");

                tryAgain = scanner.nextBoolean();
                // Catch \n character in the buffer
                scanner.nextLine();
                // Check if the user wants to restart the game
                if (tryAgain) continue;
                else break;
            }
            System.out.println("Your energy level is now: " + energyLevel);

            // Zone 2: Dark Cave
            System.out.println("\nAs you make your way out of the valley, a dark cave comes into view.");
            System.out.println("At its entrance stands a familiar wooden sign you've seen many times before.");
            System.out.println("You step closer to read it. It says: \"Dark Cave\".");

            System.out.println("\nYou take a deep breath and enter the cave, venturing deeper into the shadows.");
            System.out.println("The light fades behind you, and soon you're standing in pitch-black darkness.");
            System.out.println("😵 Confused and disoriented, the pressure and heat inside the cave begin to close in on you.");

            System.out.println("In frustration and fear, you scream: \"WHAT SHOULD I DOOO?!\"");

            System.out.println("\n🔥 Suddenly, a line of torches ignites on both sides of the cave walls, lighting your path.");
            System.out.println("You follow the glowing trail, and at the end, you find a chest surrounded by the flickering torches.");
            System.out.println("Inside the chest, there's a torch... and a sealed envelope.");
            System.out.println("📜 You open the envelope and begin to read...");

            System.out.println("📜 The envelope reads:\n");
            System.out.println("Welcome to the Dark Cave!");

            System.out.println("In this challenge, you'll need to navigate your way through a maze we’ve carefully constructed.");
            System.out.println("The maze consists of five turns — left or right — and you must choose the correct direction at each point to escape.");

            System.out.println("\n🌡️ Beware: the extreme heat inside this cave will drain your energy.");
            System.out.println("If you choose the correct path, you'll walk for about 10 minutes and reach the next turn.");
            System.out.println("But if you choose incorrectly... you’ll walk 10 minutes, only to find a dead end. HAHAHA!");

            System.out.println("\nEvery 10 minutes in this heat will reduce your energy by 5 points.");
            System.out.println("So:");
            System.out.println("✔️ Correct path → -5 energy points");
            System.out.println("❌ Incorrect path → -10 energy points (5 there + 5 back)");

            System.out.println("\nGiven the difficulty of this maze, successfully escaping will earn you *30 points*.");
            System.out.println("Good luck. Take the torch and light it using one of the flames nearby — you'll need it to see the path ahead.");

            System.out.println("So you light up the torch, start walking to " +
                    "see the first part of the maze");

            // This variable will also help to track which turn the user is in
            int correctGuesses = 0;
            // Variable to keep track of user choice
            char userChoice;
            while (correctGuesses < 5) {
                // I specifically used a do while loop, just to get some
                // practice
                int turnNumber = correctGuesses + 1;
                System.out.println("Turn: " + turnNumber);
                do {
                    System.out.println("🔀 Enter your direction: 'l' for left, 'r' for right.");
                    System.out.println("⚠️ If you enter anything else, you'll lose 1 energy point.");
                    System.out.println("Your choice: ");
                    userChoice = scanner.nextLine().charAt(0);

                    if (userChoice == 'l' || userChoice == 'r') break;
                    else energyLevel -= 1;
                    if (energyLevel <= 0) {
                        System.out.println("What a way, too loose...");
                        System.out.println("You’ve run out of energy to move.");
                        System.out.println("💀 GAME OVER!!");
                        System.out.print("Would you like to try again? (true/false): ");
                        tryAgain = scanner.nextBoolean();
                        // Catch \n character in the buffer
                        scanner.nextLine();
                        // Check if the user wants to restart the game
                        if (tryAgain) continue gameLoop;
                        else break gameLoop;
                    }
                } while (true);

                // Based on the decision, change energy level and print
                // a message
                char correctTurn = switch (turnNumber) {
                    case 1, 5 -> 'l';
                    case 2, 3, 4 -> 'r';
                    // default E will help to track possible internal errors
                    default -> 'E';
                };
                if (correctTurn == 'E') {
                    System.out.println("\n\nSomething went wrong, Error!!");
                    break;
                }
                if (userChoice == correctTurn) {
                    energyLevel -= 5;
                    correctGuesses++;
                    System.out.println("✅ You walk for 10 minutes and realize you’re on the right path. Awesome!");


                } else {
                    energyLevel -= 10;
                    System.out.println("❌ After 10 minutes, you hit a dead end. Frustrated, you turn back the way you came.");

                }
                if (energyLevel <= 0) {
                    System.out.println("Looks like all that walking and the heat caught up to you.");
                    System.out.println("Suddenly, your vision darkens, and you struggle to stay on your feet.");
                    System.out.println("You’ve run out of energy to move.");
                    System.out.println("💀 GAME OVER!!");
                    System.out.print("Would you like to try again? (true/false): ");
                    tryAgain = scanner.nextBoolean();
                    // Catch \n character in the buffer
                    scanner.nextLine();
                    // Check if the user wants to restart the game
                    if (tryAgain) continue gameLoop;
                    else break gameLoop;
                }
                System.out.println("Your energy level is now: " + energyLevel);
            }
            // Player earns 30 points
            points += 30;

            // Zone 3: Broken Bridge
            System.out.println("After successfully completing the maze challenge, you begin moving forward.");
            System.out.println("You notice another trail of torches flickering in the darkness, guiding your path.");
            System.out.println("As you follow them, you spot something unexpected");
            System.out.println("🍹 A cold glass of lemonade glistens under the torchlight. Just what you needed!");


            System.out.println("\nYou pick up the note and read:");
            System.out.println("\"Congratulations on completing the maze! After all that walking, you've probably lost a lot of energy.");
            System.out.println("The heat must have drained you, so drink this ice-cold, refreshing lemonade.");
            System.out.println("It will boost your energy for the next stage — and trust me, temperature will only increase.\"");

            System.out.println("\nYou drink the lemonade. The coolness rushes through your body — so refreshing!");
            System.out.println("✨ You feel your strength returning. Your energy level increases by 10 points.");

            energyLevel += 10;

            System.out.println("\n🧪 Current energy level: " + energyLevel);
            System.out.println("🎯 Total points earned: " + points);

            System.out.println("\nAfter drinking the lemonade, you continue along the path.");
            System.out.println("The temperature starts rising... and rising...");
            System.out.println("🔥 You suddenly realize there are no more torches lighting the way.");
            System.out.println("Instead, you find a narrow crack in the rocky wall — and a wooden sign beside it.");
            System.out.println("It reads: *Zone 4 — The Broken Bridge*");

            System.out.println("\nAs you squeeze through the crack, a dramatic sight unfolds before you:");
            System.out.println("Two extremely long bridges stretch over a sea of bubbling lava 🌋🔥.");
            System.out.println("Between them lies an envelope — carefully placed — with the words *The Broken Bridge* written on it.");

            System.out.println("\nYou open the envelope and begin to read:");

            System.out.println("\"So... you've made it this far. See how we managed to bring you from the shore...");
            System.out.println("...all the way to the heart of the volcano?");
            System.out.println("This is why our game is called *Escape from the Volcanic Island*.");

            System.out.println("\nNow, here’s your challenge:");
            System.out.println("There are two bridges. One of them is broken and will collapse into the lava in 30 minutes.");
            System.out.println("If you choose that bridge, you'll be forced to come back and lose precious energy.");
            System.out.println("The other bridge is stable and will take you to safety — if you can find it.");

            System.out.println("\nYour options:");
            System.out.println("- Cross one of the bridges now: it costs 20 energy points.");
            System.out.println("- If you choose the wrong bridge: you'll lose 40 energy points for the round trip,");
            System.out.println("  and then 20 more to cross the correct one  a total of 60 energy points.");
            System.out.println("- OR you can wait 30 minutes for the faulty bridge to collapse, then take the right one safely.");
            System.out.println("  Waiting will cost you 15 energy points.");

            System.out.println("\n🩺 Your energy level will determine your health when you leave the island.");
            System.out.println("If it’s too low, you'll need medical attention — costing you money and time.");
            System.out.println("So make your choice wisely. Your life — and your reward *35 points* — depend on it.\"");

            System.out.println("Your current energy level: " + energyLevel);
            System.out.println("With a deep rumble and the sound of shifting stone, the gap slowly closes behind you. 🪨");

            System.out.print("Type l for left bridge, r for right bridge, " +
                    "and w for wait(else you'll loose one energy point: ");
            char chosenOption;
            while (true) {
                chosenOption = scanner.nextLine().charAt(0);
                if (chosenOption == 'l' || chosenOption == 'r' || chosenOption == 'w') break;
                else energyLevel -= 1;
                if (energyLevel <= 0) {
                    System.out.println("What a way, too loose...");
                    System.out.println("You’ve run out of energy to move.");
                    System.out.println("💀 GAME OVER!!");
                    System.out.print("Would you like to try again? (true/false): ");
                    tryAgain = scanner.nextBoolean();
                    // Catch \n character in the buffer
                    scanner.nextLine();
                    // Check if the user wants to restart the game
                    if (tryAgain) continue gameLoop;
                    else break gameLoop;
                }
            }

            switch (chosenOption) {
                case 'w':
                    System.out.println("You chose the safer path and decided to wait for the faulty bridge to collapse.");
                    System.out.println("⏳ Time passes... and suddenly — with a thunderous crash — the left bridge collapses into the lava.");
                    System.out.println("✅ The right bridge is now safe to cross.");
                    energyLevel -= 35;
                    break;
                case 'r':
                    System.out.println("It seems you're willing to risk it for the biscuit. 🍪");
                    System.out.println("You take a deep breath... and start walking across the bridge.");
                    System.out.println("The heat rises around you, and the lava bubbles loudly below. 🌋");
                    System.out.println("As you approach the other side, you realize — the bridge you chose is holding steady!");
                    System.out.println("Behind you, the other bridge begins to collapse into the lava. 🔥");
                    System.out.println("You made it to the other side — just in time.");

                    energyLevel -= 20;
                    break;
                case 'l':
                    System.out.println("It seems you're willing to risk it for the biscuit. 🍪");
                    System.out.println("You step onto the bridge and begin walking...");
                    System.out.println("But after a few minutes, you notice something troubling —");
                    System.out.println("🔥 parts of the bridge are starting to catch fire!");
                    System.out.println("Panicked, you turn around and rush back to the start as fast as you can.");
                    System.out.println("Exhausted and shaken, you catch your breath.");
                    System.out.println("Without wasting any more time, you head toward the other bridge — the safe one.");
                    System.out.println("As you walk, you hear the collapsing crash of the burning bridge behind you... 🌉💥");

                    energyLevel -= 60;
                    break;
                default:
                    System.out.println("Something went horribly wrong, Error!");
                    break gameLoop;
            }
            if (energyLevel <= 0) {
                System.out.println("We knew from the beginning that the rising heat would wear you down.");
                System.out.println("And now, after surviving two brutal zones, you couldn’t make it through this one.");
                System.out.println("You’ve run out of energy to move.");
                System.out.println("💀 GAME OVER!!");
                System.out.print("Would you like to try again? (true/false): ");
                tryAgain = scanner.nextBoolean();
                // Catch \n character in the buffer
                scanner.nextLine();
                // Check if the user wants to restart the game
                if (tryAgain) continue;
                else break;
            }
            points += 35;

            // Zone 4: Volcanic Doors
            System.out.println("After passing the challenge, you see two massive doors standing before you.");
            System.out.println("Above them, ancient carvings on the wall read:");
            System.out.println("Zone 4: The Volcanic Doors 🔥🚪");
            System.out.println("\nBoth doors will lead you off the island...");
            System.out.println("But only one holds a chance to earn extra points. 💰");
            System.out.println("Choose wisely.");
            System.out.println("Type 'l' for the left door, or 'r' for the right door:");
            char chosenDoor;
            while (true) {
                chosenDoor = scanner.nextLine().charAt(0);
                if (chosenDoor == 'l' || chosenDoor == 'r') break;
                else energyLevel -= 1;
                if (energyLevel <= 0) {
                    System.out.println("What a way, too loose...");
                    System.out.println("You’ve run out of energy to move.");
                    System.out.println("💀 GAME OVER!!");
                    System.out.print("Would you like to try again? (true/false): ");
                    tryAgain = scanner.nextBoolean();
                    // Catch \n character in the buffer
                    scanner.nextLine();
                    // Check if the user wants to restart the game
                    if (tryAgain) continue gameLoop;
                    else break gameLoop;
                }
            }
            if (chosenDoor == 'r') {
                System.out.println("🎉 Congratulations! You chose wisely and earned an extra 25 points!");
                // Extra 25 points
                points += 25;
            } else {
                System.out.println("Unfortunately, no extra points for you this time... 😕");
                System.out.println("But congratulations — you’ve completed the game! 🎉");
            }


            System.out.println("🚁 As you step through the door, a helicopter appears in the distance, slowly descending.");
            System.out.println("Medical staff rush to greet you. They begin analyzing your condition to decide where you should be taken.");
            if (energyLevel < 30) {
                System.out.println("⚠️ You need immediate medical attention. We have to take you to the hospital.");
                System.out.println("🏥 You’ve been admitted and will remain under care for the next 2 weeks.");
                System.out.println("Two weeks have passed. You’re finally recovered and ready to collect your prize money! 💰");

            } else if (energyLevel < 70) {
                System.out.println("You're not in bad condition, but some medical attention would help.");
                System.out.println("You'll stay in the hospital for a few days.");
                System.out.println("\nA few days pass, and you're now feeling great.");
                System.out.println("You're ready to leave and collect your prize money! 💰");

            } else {
                System.out.println("You’re completely fine — no medical attention is needed. ✅");
                System.out.println("You’re free to go and collect your prize money! 💰");
            }
            // Collecting the prize money based on earned points
            System.out.println("🎉 Your prize money is calculated as 1000 times the points you've collected.");
            System.out.println("💰 So your total prize money is: $" + (points * 1000));
            System.out.println("Once again, congratulations on escaping the island!");


            System.out.print("\n Would you like to play again? (true/false): ");
            boolean playAgain = scanner.nextBoolean();
            scanner.nextLine();
            if (!playAgain) break;
        }
    }
}

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        //MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Advanced Mad Libs Game!");
        System.out.println("You’ll fill in the blanks and create a fun story.\n");

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        String playerName;
        
        System.out.print("Enter an adjective (Name of a Zoo): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (Name of an Animal): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (musical instrument): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();


        System.out.print("Enter a word to describe a zoo (e.g., wild, magical): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter the name of an animal (e.g., monkey, panda): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter a word to describe how a violin might sound (e.g., soothing, melodic): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb ending in -ing (e.g., rampaging, dancing): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter a descriptive adjective (e.g., joyful, amazed): ");
        adjective3 = scanner.nextLine();

        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();


        //FunFacts
        String[] funFacts ={
                "A dog's sense of smell is between 10,000 and 100,000 " +
                        "\ntimes better than a human's, but they have just one-sixth our number of taste buds.",
                "Tigers can eat 40 pounds in a single meal. After such a big meal they" +
                        "\ncan as long as a week without eating.",
                "Horses use their ears and eyes to communicate with each other. " +
                        "\nSo far, Mr. Ed is the only 'talking' horse.",
                "Honeybees can flap their wings 200 times every second.",
                "Certain types of male penguins 'propose' to their females by " +
                        "\ngiving them a pebble—which brings a whole new meaning to the phrase 'nice rock!'",
                "Squirrels can't vomit or burp, so don't try to blame your picnic lunch belch on one.",
                "Ever wondered why flamingos stand on one leg? To stay warm. " +
                        "\nKeeping one leg close to the body conserves heat.",
                "Anteaters can consume 35,000 ants and termites in a single day.",
                "Birds have a great sense of sight but a poor sense of smell, " +
                        "\nso go ahead and put a baby bird back in its nest. The " +
                        "\nmother bird likely won't smell that a human has touched her kiddo.",
                "Meows are not an innate cat language. They developed them to " +
                        "\ncommunicate with us! While cats can make more than " +
                        "\n100 different sounds, dogs only make around 10.",
                "A blue whale's blowhole can spray water 30 feet in the air.",
                "African buffalo herds are democratic and feminist: Only adult " +
                        "\nfemales can 'vote' for which way to travel. The indicate" +
                        "\nheir choice by standing up, looking in one direction and then lying back down.",
                "Butterflies can taste with their feet. They use the taste sensors " +
                        "\nthere to determine which leaves caterpillars can eat so they know where to lay their eggs.",
                "The average dog is about as smart as a two-year-old child. " +
                        "\nThat explains a lot—about both canines and toddlers!",
                "Unlike most every other mammal, cats can't taste sweetness. " +
                        "\nThey're also often lactose intolerant, so you might " +
                        "\nas well lick your own ice cream bowl clean!",
                "The toothy grins of chimps in TV shows don't mean what you think. " +
                        "\nThey make a grunting sound when happy.",
                "Humans sweat all over their bodies, but dogs only sweat on the pads of their feet.",
                "Cats have over 20 muscles to control their ears and can rotate " +
                        "\nthem 180 degrees. No wonder their sense of hearing is so amazing!",
                "Bottlenose dolphins swim up to 18 miles an hour. " +
                        "\nMost humans are lucky to swim 4 miles per hour.",
                "Elephants have a specific warning call that means 'human.'",
                "In the hot Australian desert, kangaroos lick their arms to stay cool.",
                "A hippo can open its mouth wide enough for a 4-foot-tall " +
                        "\nchild to stand inside. But please, don't try this at home.",
                "Tigers have striped skin as well as striped fur.",
                "Underneath their stripes, zebras have black skin."
        };
        int randomNumber= (int) (Math.random()*20);
        String randomFact = funFacts[randomNumber];

        System.out.println("\n\n🎵 A Day at the " + adjective1 + " Zoo 🎵\n");
        System.out.println("---------------------------------------------------");
        System.out.println("The " + noun1 + "s were busy eating their breakfast,");
        System.out.println("but the " + adjective2 + " violin soon attracted an audience...");
        System.out.println("The elephant stood listening with deep attention, one foot raised from the ground...");
        System.out.println("The tiger awoke, and lay down again and dozed...");
        System.out.println("But at the first notes of the piccolo, the tiger sprang to its feet,");
        System.out.println("bounded across the den, reared on its hind feet...");
        System.out.println("The tiger ceased to " + verb1 + " and listened with " + adjective3 + " pleasure to the music.");
        System.out.println("---------------------------------------------------");
        System.out.println("Oh, and here’s a fun fact: " + randomFact);
        System.out.println("Thanks for going on this zoo adventure, " + playerName + "! 🐯");

        scanner.close();
    }
}

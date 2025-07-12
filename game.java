import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Player player = new Player();
        character(player);
        player.printStats();
    }

    public static void character(Player player) {
        boolean madeChoice = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of your character");    
        player.playerName = scanner.nextLine();    

        while (!madeChoice) {
            System.out.println("Please select a class:");
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.println("3. Ranger");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("You have chosen Warrior!");
                    chooseWarrior(player);
                    madeChoice = true;
                    break;
                case "2":
                    System.out.println("You have chosen Mage!");
                    chooseMage(player);
                    madeChoice = true;
                    break;
                case "3":
                    System.out.println("You have chosen Ranger!");
                    chooseRanger(player);
                    madeChoice = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }

    public static void chooseWarrior(Player player) {
        player.health = 200;
        player.attackDamage = 5;
        player.playerClass = "Warrior";
        System.out.println("Warrior stats activated");
    }

    public static void chooseMage(Player player) {
        player.health = 100;
        player.attackDamage = 15;
        player.playerClass = "Mage";
        System.out.println("Mage stats activated");
    }

    public static void chooseRanger(Player player) {
        player.health = 120;
        player.attackDamage = 10;
        player.playerClass = "Ranger";
        System.out.println("Ranger stats activated");
    }
}
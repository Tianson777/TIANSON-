import java.util.Scanner;

class GameCharacter {

    // Five fields
    String name;
    String role;
    int level;
    int hp;
    int mana;

    // Constructor
    GameCharacter(String name, String role, int level, int hp, int mana) {
        this.name = name;
        this.role = role;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
    }

    // Method 1: Displays all information
    void displayInformation() {
        System.out.println("\n--- Game Character Information ---");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Mana: " + mana);
    }

    // Method 2: Performs a simple action
    void useSkill() {
        System.out.println(name + " uses a special skill!");
        System.out.println(name + " attacks the enemy using their ability.");
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for the five fields
        System.out.print("Enter hero name: ");
        String name = input.nextLine();

        System.out.print("Enter hero role: ");
        String role = input.nextLine();

        System.out.print("Enter hero level: ");
        int level = input.nextInt();

        System.out.print("Enter hero HP: ");
        int hp = input.nextInt();

        System.out.print("Enter hero Mana: ");
        int mana = input.nextInt();

        // Instantiate one GameCharacter object
        GameCharacter hero = new GameCharacter(
            name, role, level, hp, mana
        );

        // Call the methods
        hero.displayInformation();
        hero.useSkill();

        input.close();
    }
}
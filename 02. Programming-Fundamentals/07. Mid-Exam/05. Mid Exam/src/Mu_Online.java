import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mu_Online {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        int health = 100;
        int bitcoins = 0;

        int currRoom = 0;
        int bestRoom = 0;
        while (currRoom != rooms.size()) {
            String[] command = rooms.get(currRoom).split("\\s+");
            bestRoom++;
            switch (command[0]) {
                case "potion":
                    health = usePotion(health, Integer.parseInt(command[1]));
                    break;
                case "chest":
                    bitcoins = openChest(bitcoins, Integer.parseInt(command[1]));
                    break;
                default:
                    health = fightMonster(health, command[0], Integer.parseInt(command[1]));
                    if (health <= 0) {
                        System.out.printf("Best room: %d\n", bestRoom);
                        return;
                    }
                    break;
            }
            currRoom++;
        }

        System.out.printf("You've made it!\nBitcoins: %d\nHealth: %d\n", bitcoins, health);
    }

    private static int usePotion(int health, int potionStrength) {
        if (health == 100) {
            System.out.println("You healed for 0 hp.");
            System.out.println("Current health: 100 hp.");
            return 100;
        }

        int healedAmount;
        if (health + potionStrength > 100) {
            healedAmount = 100 - health;
            health = 100;
        } else {
            healedAmount = potionStrength;
            health += potionStrength;
        }

        System.out.printf("You healed for %d hp.\n", healedAmount);
        System.out.printf("Current health: %d hp.\n", health);
        return health;
    }

    private static int openChest(int bitcoins, int bitcoinsInTreasure) {
        System.out.printf("You found %d bitcoins.\n", bitcoinsInTreasure);
        bitcoins += bitcoinsInTreasure;
        return bitcoins;
    }

    private static int fightMonster(int health, String monsterType, int monsterAttack) {
        health -= monsterAttack;
        if (health <= 0) {
            System.out.printf("You died! Killed by %s.\n", monsterType);
        } else {
            System.out.printf("You slayed %s.\n", monsterType);
        }
        return health;
    }
}

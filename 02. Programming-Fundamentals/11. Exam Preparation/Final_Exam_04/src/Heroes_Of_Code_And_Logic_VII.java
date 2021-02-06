import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Heroes_Of_Code_And_Logic_VII {

    private static class Hero {
        String name;
        int health;
        int mana;

        public Hero(String name, int health, int mana) {
            this.name = name;
            this.health = health;
            this.mana = mana;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getMana() {
            return mana;
        }

        public void setMana(int mana) {
            this.mana = mana;
        }

        @Override
        public String toString() {
            return String.format("%s\n  HP: %d\n  MP: %d", name, health, mana);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Hero> heroes = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String name = input[0];
            int health = Integer.parseInt(input[1]);
            int mana = Integer.parseInt(input[2]);

            heroes.put(name, new Hero(name, health, mana));
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split(" - ");

            switch (commands[0]) {
                case "CastSpell":
                    castSpell(heroes, commands[1], Integer.parseInt(commands[2]), commands[3]);
                    break;
                case "TakeDamage":
                    takeDamage(heroes, commands[1], Integer.parseInt(commands[2]), commands[3]);
                    break;
                case "Recharge":
                    recharge(heroes, commands[1], Integer.parseInt(commands[2]));
                    break;
                case "Heal":
                    heal(heroes, commands[1], Integer.parseInt(commands[2]));
                    break;
            }

            input = scanner.nextLine();
        }

        heroes.entrySet().stream()
                .sorted(Comparator.comparing(f -> f.getValue().getName()))
                .sorted((f,s) -> s.getValue().getHealth() - f.getValue().getHealth())
                .forEach(e -> System.out.println(e.getValue().toString()));
    }

    private static void castSpell(Map<String, Hero> heroes, String name, int mana, String spell) {
        Hero hero = heroes.get(name);
        if (hero.getMana() - mana >= 0) {
            hero.setMana(hero.getMana() - mana);
            heroes.put(name, hero);
            System.out.printf("%s has successfully cast %s and now has %d MP!\n", name, spell, hero.getMana());
        } else {
            System.out.printf("%s does not have enough MP to cast %s!\n", name, spell);
        }
    }

    private static void takeDamage(Map<String, Hero> heroes, String name, int damage, String attacker) {
        Hero hero = heroes.get(name);
        if (hero.getHealth() - damage > 0) {
            hero.setHealth(hero.getHealth() - damage);
            heroes.put(name, hero);
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",
                    name, damage, attacker, hero.getHealth());
        } else {
            heroes.remove(name);
            System.out.printf("%s has been killed by %s!\n", name, attacker);
        }
    }

    private static void recharge(Map<String, Hero> heroes, String name, int amount) {
        Hero hero = heroes.get(name);
        int heroMana = hero.getMana();
        int rechargedAmount = amount;

        if (heroMana + amount > 200) {
            rechargedAmount = 200 - heroMana;
            hero.setMana(200);
        } else {
            hero.setMana(heroMana + amount);
        }

        heroes.put(name, hero);
        System.out.printf("%s recharged for %d MP!\n", name, rechargedAmount);
    }

    private static void heal(Map<String, Hero> heroes, String name, int amount) {
        Hero hero = heroes.get(name);
        int heroHealth = hero.getHealth();
        int rechargedAmount = amount;

        if (heroHealth + amount > 100) {
            rechargedAmount = 100 - heroHealth;
            hero.setHealth(100);
        } else {
            hero.setHealth(heroHealth + amount);
        }

        heroes.put(name, hero);
        System.out.printf("%s healed for %d HP!\n", name, rechargedAmount);
    }
}

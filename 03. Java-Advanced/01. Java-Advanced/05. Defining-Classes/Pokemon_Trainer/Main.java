package Pokemon_Trainer;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Tournament")) {
            String[] data = input.split("\\s+");

            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer(trainerName));
            }

            trainers.get(trainerName).addPokemon(new Pokemon(pokemonName, pokemonElement, pokemonHealth));

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {

            for (Trainer trainer : trainers.values()) {
                trainer.fight(input);
            }

            input = scanner.nextLine();
        }

        trainers.entrySet().stream()
                .sorted((f, s) -> s.getValue().getBadges() - f.getValue().getBadges())
                .forEach(e -> System.out.println(e.getValue().toString()));
    }
}

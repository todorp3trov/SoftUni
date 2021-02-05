package Final_Exam_05;

import java.util.*;

public class Pirates {

    private static class City {
        String name;
        int population;
        int gold;

        public City(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public void increasePopAndGold(int population, int gold) {
            this.population += population;
            this.gold += gold;
        }

        @Override
        public String toString() {
            return String.format("%s -> Population: %d citizens, Gold: %d kg", name, population, gold);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, City> cities = new LinkedHashMap<>();

        String input = scanner.nextLine().trim();
        while (!input.equals("Sail")) {
            String[] cityData = input.split("[||]{2}");
            String cityName = cityData[0];
            int population = Integer.parseInt(cityData[1]);
            int gold = Integer.parseInt(cityData[2]);
            City city = new City(cityName, population, gold);

            if (!cities.containsKey(cityData[0])) {
                cities.put(cityName, city);
            } else {
                city = cities.get(cityName);
                city.increasePopAndGold(population, gold);
                cities.put(cityName, city);
            }

            input = scanner.nextLine().trim();
        }

        input = scanner.nextLine().trim();
        while (!input.equals("End")) {
            String[] commands = input.split("=>");
            switch (commands[0]) {
                case "Plunder":
                    plunderTown(cities, commands[1], Integer.parseInt(commands[2]), Integer.parseInt(commands[3]));
                    break;
                case "Prosper":
                    prosperTown(cities, commands[1], Integer.parseInt(commands[2]));
                    break;
            }

            input = scanner.nextLine().trim();
        }

        if (cities.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", cities.size());
            cities.entrySet().stream()
                    .sorted(Comparator.comparing(f -> f.getValue().getName()))
                    .sorted((f,s) -> s.getValue().getGold() - f.getValue().getGold())
                    .forEach(c -> System.out.println(c.getValue().toString()));
        }
    }

    private static void plunderTown(Map<String, City> cities, String town, int population, int gold) {
        if (cities.containsKey(town)) {
            City city = cities.get(town);

            city.setPopulation(city.getPopulation() - population);
            city.setGold(city.getGold() - gold);

            System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, population);
            if (city.getGold() <= 0 || city.getPopulation() <= 0) {
                cities.remove(town);
                System.out.printf("%s has been wiped off the map!\n", town);
            } else {
                cities.put(town, city);
            }
        }
    }

    private static void prosperTown(Map<String, City> cities, String town, int gold) {
        if (cities.containsKey(town)) {
            if (gold < 0) {
                System.out.println("Gold added cannot be a negative number!");
                return;
            } else {
                City city = cities.get(town);

                city.setGold(city.getGold() + gold);

                cities.put(town, city);
                System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", gold, town, city.getGold());
            }
        }
    }
}

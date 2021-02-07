import java.util.*;

public class Plant_Discovery {

    private static class Plant {
        String name;
        int rarity;
        double rating;
        List<Double> ratings;

        public Plant(String name, int rarity, double rating) {
            this.name = name;
            this.rarity = rarity;
            this.rating = rating;
            this.ratings = new LinkedList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public void addRating(double rating) {
            this.ratings.add(rating);
        }

        public void removeAllRatings() {
            rating = 0;
            ratings.clear();
        }

        private void getAndSetAverageRating() {
            rating = ratings.stream().mapToDouble(Double::doubleValue).average().orElse(0f);
        }

        @Override
        public String toString() {
            getAndSetAverageRating();
            return String.format("- %s; Rarity: %d; Rating: %.2f", name, rarity, rating);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Plant> plants = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");

            String plantName = input[0];
            int plantRarity = Integer.parseInt(input[1]);
            int plantRating = 0;
            Plant plant = new Plant(plantName, plantRarity, plantRating);

            if (plants.containsKey(plantName)) {
                int rarity = plants.get(plantName).getRarity() + plantRarity;
                plant.setRarity(rarity);
            }
            plants.put(plantName, plant);
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] commands = input.split("[: -]+");

            switch (commands[0]) {
                case "Rate":
                    rate(plants, commands[1], Integer.parseInt(commands[2]));
                    break;
                case "Update":
                    update(plants, commands[1], Integer.parseInt(commands[2]));
                    break;
                case "Reset":
                    reset(plants, commands[1]);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plants.entrySet().stream()
                .sorted((f,s) -> Double.compare(s.getValue().getRating(),f.getValue().getRating()))
                .sorted((f,s) -> s.getValue().getRarity() - f.getValue().getRarity())
                .forEach(v -> System.out.println(v.getValue().toString()));

    }

    private static void rate(Map<String, Plant> plants, String plantName, double rating) {
        if (plants.containsKey(plantName)) {
            Plant plant = plants.get(plantName);
            plant.setRating(rating);
            plant.addRating(rating);

            plants.put(plantName, plant);
        } else {
            System.out.println("error");
        }
    }

    private static void update(Map<String, Plant> plants, String plantName, int newRarity) {
        if (plants.containsKey(plantName)) {
            plants.get(plantName).setRarity(newRarity);
        } else {
            System.out.println("error");
        }
    }

    private static void reset(Map<String, Plant> plants, String plantName) {
        if (plants.containsKey(plantName)) {
            plants.get(plantName).removeAllRatings();
        } else {
            System.out.println("error");
        }
    }
}

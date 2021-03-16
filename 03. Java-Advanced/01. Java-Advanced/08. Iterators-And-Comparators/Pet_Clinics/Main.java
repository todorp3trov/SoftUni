package Pet_Clinics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Clinic> clinics = new HashMap<>();
        Map<String, Pet> pets = new HashMap<>();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split("\\s+");

            switch (data[0]) {
                case "Create":
                    if (data[1].equals("Pet")) {
                        pets.putIfAbsent(data[2], new Pet(data[2], Integer.parseInt(data[3]), data[4]));
                    } else {
                        if (Integer.parseInt(data[3]) % 2 == 0) {
                            System.out.println("Invalid Operation!");
                        } else {
                            clinics.putIfAbsent(data[2], new Clinic(data[2], Integer.parseInt(data[3])));
                        }
                    }
                    break;
                case "Add":
                    if (!pets.containsKey(data[1]) || !clinics.containsKey(data[2])) {
                        System.out.println("Invalid Operation!");
                    } else {
                        System.out.println(clinics.get(data[2]).addPet(pets.get(data[1])));
                    }
                    break;
                case "Release":
                    if (isExistingClinic(clinics, data[1])) {
                        System.out.println(clinics.get(data[1]).release());
                    }
                    break;
                case "HasEmptyRooms":
                    if (isExistingClinic(clinics, data[1])) {
                        System.out.println(clinics.get(data[1]).hasEmptyRooms());
                    }
                    break;
                case "Print":
                    if (isExistingClinic(clinics, data[1])) {
                        if (data.length == 2) {
                            clinics.get(data[1]).print();
                        } else {
                            clinics.get(data[1]).print(Integer.parseInt(data[2]));
                        }
                    }
                    break;
            }
        }
    }

    private static boolean isExistingClinic(Map<String, Clinic> clinics, String key) {
        if (!clinics.containsKey(key)) {
            System.out.println("Invalid Operation!");
            return false;
        }
        return true;
    }
}

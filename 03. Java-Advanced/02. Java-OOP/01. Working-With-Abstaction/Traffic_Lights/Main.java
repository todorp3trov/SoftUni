package Traffic_Lights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder result = new StringBuilder();

        List<TrafficLight> trafficLights = Arrays.stream(reader.readLine().split(" "))
                .map(e -> new TrafficLight(Light.valueOf(e)))
                .collect(Collectors.toList());
        
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                result.append(trafficLight.getLight().name()).append(" ");
            }
            result.append(System.lineSeparator());
        }

        System.out.print(result.toString());
    }
}

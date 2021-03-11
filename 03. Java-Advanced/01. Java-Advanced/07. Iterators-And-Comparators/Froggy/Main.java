package Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Lake lake = new Lake(Arrays.stream(reader.readLine().split(", "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList()));

        StringBuilder sb = new StringBuilder();

        for (Integer i : lake) {
            sb.append(i).append(", ");
        }

        System.out.println(sb.replace(sb.length() - 2, sb.length(), "").toString());
    }
}

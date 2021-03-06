package Tuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        Tuple<String, String> nameAndAddress = new Tuple<>(input[0] + " " + input[1], input[2]);
        System.out.println(nameAndAddress.toString());

        input = reader.readLine().split(" ");

        Tuple<String, Integer> nameAndBeer = new Tuple<>(input[0], Integer.parseInt(input[1]));
        System.out.println(nameAndBeer.toString());

        input = reader.readLine().split(" ");

        Tuple<Integer, Double> intAndDouble = new Tuple<>(Integer.parseInt(input[0]), Double.parseDouble(input[1]));
        System.out.println(intAndDouble.toString());
    }
}

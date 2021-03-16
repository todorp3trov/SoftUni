package Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        Threeuple<String, String, String> nameAddressTown =
                new Threeuple<>(input[0] + " " + input[1], input[2], input[3]);
        System.out.println(nameAddressTown.toString());

        input = reader.readLine().split(" ");

        Threeuple<String, Integer, Boolean> nameBeerIsDrunk =
                new Threeuple<>(input[0], Integer.parseInt(input[1]), input[2].equals("drunk"));
        System.out.println(nameBeerIsDrunk.toString());

        input = reader.readLine().split(" ");

        Threeuple<String, Double, String> nameBalanceBankName =
                new Threeuple<>(input[0], Double.parseDouble(input[1]), input[2]);
        System.out.println(nameBalanceBankName.toString());
    }
}

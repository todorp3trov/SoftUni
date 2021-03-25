package Cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //StringBuilder result = new StringBuilder();

        CardRank cardRank = CardRank.valueOf(reader.readLine());
        CardSuit cardSuit = CardSuit.valueOf(reader.readLine());

        int totalPower = cardRank.getPower() + cardSuit.getPower();

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank.name(), cardSuit.name(), totalPower);
    }

    private static void printCardRanks(StringBuilder result) {
        result.append("Card Ranks:").append(System.lineSeparator());
        for (CardRank cardRank : CardRank.values()) {
            result.append(String.format("Ordinal value: %d; Name value: %s",
                    cardRank.ordinal(), cardRank.name()))
                    .append(System.lineSeparator());
        }
        System.out.print(result.toString());
        result.delete(0, result.length());
    }

    private static void printCardSuits(StringBuilder result) {
        result.append("Card Suits:").append(System.lineSeparator());
        for (CardSuit cardSuit : CardSuit.values()) {
            result.append(String.format("Ordinal value: %d; Name value: %s",
                    cardSuit.ordinal(), cardSuit.name()))
                    .append(System.lineSeparator());
        }
        System.out.print(result.toString());
        result.delete(0, result.length());
    }
}

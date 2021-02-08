import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Memory_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> seq = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int moves = 0;
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] guesses = input.split(" ");
            int index1 = Integer.parseInt(guesses[0]);
            int index2 = Integer.parseInt(guesses[1]);
            moves++;

            if ((index1 < 0 || index1 >= seq.size())
                    || (index2 < 0 || index2 >= seq.size())) {
                System.out.println("Invalid input! Adding additional elements to the board");
                String element = "-" + moves + "a";
                seq.add(seq.size() / 2, element);
                seq.add(seq.size() / 2, element);
            } else {
                if (seq.get(index1).equals(seq.get(index2))) {
                    System.out.printf("Congrats! You have found matching elements - %s!\n", seq.get(index1));
                    seq.remove(Math.max(index1, index2));
                    seq.remove(Math.min(index1, index2));
                } else {
                    System.out.println("Try again!");
                }
            }

            if (seq.isEmpty()) {
                System.out.printf("You have won in %d turns!\n", moves);
                return;
            }
            input = scanner.nextLine();
        }

        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", seq));
    }
}

import java.util.Scanner;

public class Kamino_Factory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaLen = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int[] bestDna = new int[dnaLen];
        int bestSum = 0;
        int bestIndexed = Integer.MAX_VALUE;
        int bestLen = 0;
        int counter = 0;
        int pos = 0;
        while (!input.equals("Clone them!")) {
            counter++;
            String[] splitter = input.split("!+");
            int[] dnqSequence = new int[dnaLen];
            for (int i = 0; i < dnqSequence.length; i++) {
                dnqSequence[i] = Integer.parseInt(splitter[i]);
            }

            int sequenceSum = 0;
            int bestSequenceLen = 0;
            int sequenceIndex = 0;
            for (int i = 0; i < dnqSequence.length; i++) {
                int sequenceLen = 0;
                sequenceSum += dnqSequence[i];
                for (int j = i; j < dnqSequence.length; j++) {
                    if (dnqSequence[j] == 1) {
                        sequenceLen++;
                        if (sequenceLen > bestSequenceLen) {
                            bestSequenceLen = sequenceLen;
                            sequenceIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }

            if (bestSequenceLen > bestLen) {
                bestLen = bestSequenceLen;
                bestIndexed = sequenceIndex;
                bestSum = sequenceSum;
                pos = counter;
                bestDna = dnqSequence;
            } else if (sequenceIndex < bestIndexed || sequenceSum > bestSum) {
                bestIndexed = sequenceIndex;
                bestSum = sequenceSum;
                pos = counter;
                bestDna = dnqSequence;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.\n", pos, bestSum);
        for (int i = 0; i < bestDna.length; i++) {
            System.out.print(bestDna[i] + " ");
        }
    }
}

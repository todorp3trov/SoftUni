import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class The_Pianist {

    private static class PianoPiece {
        String pieceName;
        String composerName;
        String pieceKey;

        public PianoPiece(String pieceName, String composerName, String pieceKey) {
            this.pieceName = pieceName;
            this.composerName = composerName;
            this.pieceKey = pieceKey;
        }

        public String getPieceName() {
            return pieceName;
        }

        public String getComposerName() {
            return composerName;
        }

        public void changePieceKey(String key) {
            this.pieceKey = key;
        }

        @Override
        public String toString() {
            return String.format("%s -> Composer: %s, Key: %s", pieceName, composerName, pieceKey);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, PianoPiece> pieces = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|");
            String piece = data[0];
            String composerName = data[1];
            String key = data[2];

            PianoPiece pianoPiece = new PianoPiece(piece, composerName, key);
            pieces.put(piece, pianoPiece);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commands = input.split("\\|");

            switch (commands[0]) {
                case "Add":
                    addPiece(pieces, commands[1], commands[2], commands[3]);
                    break;
                case "Remove":
                    removePiece(pieces, commands[1]);
                    break;
                case "ChangeKey":
                    changeKey(pieces, commands[1], commands[2]);
                    break;
            }

            input = scanner.nextLine();
        }

        pieces.entrySet().stream()
                .sorted(Comparator.comparing(f -> f.getValue().getComposerName()))
                .sorted(Comparator.comparing(f -> f.getValue().getPieceName()))
                .forEach(p -> System.out.println(p.getValue().toString()));
    }

    private static void addPiece(Map<String, PianoPiece> pieces, String piece, String composer, String key) {
        if (pieces.containsKey(piece)) {
            System.out.printf("%s is already in the collection!\n", piece);
        } else {
            pieces.put(piece, new PianoPiece(piece, composer, key));
            System.out.printf("%s by %s in %s added to the collection!\n", piece, composer, key);
        }
    }

    private static void removePiece(Map<String, PianoPiece> pieces, String piece) {
        if (pieces.containsKey(piece)) {
            pieces.remove(piece);
            System.out.printf("Successfully removed %s!\n", piece);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
        }
    }

    private static void changeKey(Map<String, PianoPiece> pieces, String piece, String key) {
        if (pieces.containsKey(piece)) {
            pieces.get(piece).changePieceKey(key);
            System.out.printf("Changed the key of %s to %s!\n", piece, key);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
        }
    }
}

import java.util.Scanner;

public class Common_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstString = scanner.nextLine().split(" ");
        String[] secondString = scanner.nextLine().split(" ");
        String sameWords = "";

        for (int i = 0; i < secondString.length; i++) {
            for (int j = 0; j < firstString.length; j++) {
                if (secondString[i].equals(firstString[j])) {
                    sameWords += secondString[i] + " ";
                }
            }
        }

        System.out.println(sameWords);
    }
}

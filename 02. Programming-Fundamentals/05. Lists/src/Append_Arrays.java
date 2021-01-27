import java.util.Scanner;

public class Append_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\|");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            String[] currentArr = arr[i].split("\\s+");
            for (int j = 0; j < currentArr.length; j++) {
                if (!currentArr[j].equals("")) {
                    result += currentArr[j] + " ";
                }
            }
        }
        System.out.println(result);
    }
}

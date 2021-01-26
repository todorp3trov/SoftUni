import java.util.Scanner;

public class Beer_Kegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String bestModel = "";
        double bestVolume = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentKegVolume = Math.PI * (radius * radius) * height;
            if (currentKegVolume > bestVolume) {
                bestModel = name;
                bestVolume = currentKegVolume;
            }
        }

        System.out.println(bestModel);
    }
}

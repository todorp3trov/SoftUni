import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long bestSnowballValue = Integer.MIN_VALUE;
        String s = "";
        for (int i = 0; i < n; i++) {
            int snowballSnow = scanner.nextInt();
            int snowballTime = scanner.nextInt();
            int snowballQuality = scanner.nextInt();

            int temp = snowballSnow / snowballTime;
            long currentSnowballValue = (long) Math.pow(temp, snowballQuality);
            if (currentSnowballValue > bestSnowballValue) {
                bestSnowballValue = currentSnowballValue;
                s = snowballSnow + " : " + snowballTime + " = " + currentSnowballValue + " (" + snowballQuality + ")";
            }
        }
        System.out.println(s);
    }
}

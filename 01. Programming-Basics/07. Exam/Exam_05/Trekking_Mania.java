import java.util.Scanner;

public class Trekking_Mania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double[] peopleClimbingEachPeak = new double[5];
        int totalPeople = 0;


        for (int i = 0; i < n; i++) {
            int group = Integer.parseInt(scanner.nextLine());
            totalPeople += group;

            if (group <= 5) {
                peopleClimbingEachPeak[0] += group;
            } else if (group >= 6 && group <= 12) {
                peopleClimbingEachPeak[1] += group;
            } else if (group >= 13 && group <= 25) {
                peopleClimbingEachPeak[2] += group;
            } else if (group >= 26 && group <= 40) {
                peopleClimbingEachPeak[3] += group;
            } else if (group >= 41) {
                peopleClimbingEachPeak[4] += group;
            }
        }

        for (int i = 0; i < peopleClimbingEachPeak.length; i++) {
            System.out.printf("%.2f%%\n", (peopleClimbingEachPeak[i] / totalPeople) * 100);
        }
    }
}

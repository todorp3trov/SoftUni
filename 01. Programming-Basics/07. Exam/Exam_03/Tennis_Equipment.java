import java.util.Scanner;

public class Tennis_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int racketsAmount = Integer.parseInt(scanner.nextLine());
        int sneakersAmount = Integer.parseInt(scanner.nextLine());

        double totalRacketPrice = racketPrice * racketsAmount;
        double totalSneakersPrice = sneakersAmount * (racketPrice / 6);
        double otherEquipmentPrice = (totalRacketPrice + totalSneakersPrice) * 0.2;

        double totalPrice = totalRacketPrice + totalSneakersPrice + otherEquipmentPrice;
        double pricePaidByDjako = Math.floor(totalPrice * 0.125);
        double pricePaidBySponsors = Math.ceil(totalPrice * 0.875);

        System.out.printf("Price to be paid by Djokovic %d\n" +
                "Price to be paid by sponsors %d", (int) pricePaidByDjako, (int) pricePaidBySponsors);
    }
}

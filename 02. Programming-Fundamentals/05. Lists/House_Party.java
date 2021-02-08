import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class House_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGuests = Integer.parseInt(scanner.nextLine());
        Set<String> guests = new LinkedHashSet<>();
        for (int i = 0; i < numGuests; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            manipulateGuestList(guests, input);
        }

        for (String guest : guests) {
            System.out.println(guest);
        }
    }

    private static void manipulateGuestList(Set<String> guests, String[] input) {
        String guestName = input[0];
        if (input[2].equals("going!")) {
            if (!guests.contains(guestName)) {
                guests.add(guestName);
            } else {
                System.out.println(guestName + " is already in the list!");
            }
        } else {
            if (!guests.contains(guestName)) {
                System.out.println(guestName + " is not in the list!");
            } else {
                guests.remove(guestName);
            }
        }
    }
}

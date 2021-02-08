import java.util.Scanner;

public class Old_Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int booksChecked = 0;
        String bookNeeded = scanner.nextLine();

        boolean foundBook = false;
        String input = scanner.nextLine();
        while (!input.equals("No More Books")) {
           if (input.equals(bookNeeded)) {
                foundBook = true;
                break;
            }
            booksChecked++;
        }

        if (foundBook) {
            System.out.printf("You checked %d books and found it.", booksChecked);
        } else {
            System.out.printf("The book you search is not here!\nYou checked %d books.", booksChecked);
        }
    }
}

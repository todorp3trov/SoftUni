package ListyIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input;

        try {
            input = reader.readLine().substring(7).split(" ");
        } catch (StringIndexOutOfBoundsException ex) {
            input = new String[0];
        }

        ListyIterator listyIterator = new ListyIterator(input);

        while (true) {
            String command = reader.readLine();
            switch (command) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    listyIterator.print();
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    for (String string : listyIterator) {
                        System.out.print(string + " ");
                    }
                    System.out.println();
                    break;
                case "END":
                    return;
            }
        }
    }
}

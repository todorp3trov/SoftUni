package Rhombus_Of_Stars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhombus_Of_Stars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            printRow(n, i, sb);
        }

        for (int i = n - 1; i >= 1; i--) {
            printRow(n, i, sb);
        }

        System.out.print(sb.toString());
    }

    private static void printRow(int n, int i, StringBuilder sb) {
        sb.append(" ".repeat(Math.max(0, n - i)));
        sb.append("* ".repeat(Math.max(0, i)));
        sb.append(System.lineSeparator());
    }
}

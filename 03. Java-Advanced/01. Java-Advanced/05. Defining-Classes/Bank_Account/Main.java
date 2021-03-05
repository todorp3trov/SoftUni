package Bank_Account;

import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, BankAccount> bankAccounts = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split(" ");

            switch (commands[0]) {
                case "Create":
                    BankAccount newBankAccount = new BankAccount();
                    bankAccounts.put(newBankAccount.getId(), newBankAccount);
                    break;
                case "Deposit":
                    if (bankAccounts.containsKey(Integer.parseInt(commands[1]))) {
                        bankAccounts.get(Integer.parseInt(commands[1])).deposit(Double.parseDouble(commands[2]));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(commands[1]));
                    break;
                case "GetInterest":
                    if (bankAccounts.containsKey(Integer.parseInt(commands[1]))) {
                        bankAccounts.get(Integer.parseInt(commands[1])).getInterest(Integer.parseInt(commands[2]));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}

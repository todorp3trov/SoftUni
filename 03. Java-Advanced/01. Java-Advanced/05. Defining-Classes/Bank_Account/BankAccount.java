package Bank_Account;

class BankAccount {
    private static int bankAccount = 1;
    private static double interestRate = 0.02;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = bankAccount++;
        System.out.printf("Account ID%d created\n", this.id);
    }

    public int getId() {
        return id;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {
        double currentInterest = BankAccount.interestRate * years * this.balance;
        System.out.printf("%.2f\n", currentInterest);
        return currentInterest;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Deposited %.0f to ID%d\n", amount, this.id);
    }
}

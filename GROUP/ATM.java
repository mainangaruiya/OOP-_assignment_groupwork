import java.util.Scanner;

class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public void withdrawCash(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. You cannot withdraw more than the available balance.");
        } else {
            balance -= amount;
            System.out.println("You have successfully withdrawn $" + amount);
            checkBalance();
        }
    }

    public void transferMoney(double amount, String bankType) {
        double transferFee = 0;
        if (bankType.equalsIgnoreCase("other")) {
            transferFee = 0.001 * amount;
        }

        double totalAmount = amount + transferFee;

        if (totalAmount > balance) {
            System.out.println("Insufficient funds. You cannot transfer more than the available balance.");
        } else {
            balance -= totalAmount;
            System.out.println("You have successfully transferred $" + amount + " to another account.");
            if (transferFee > 0) {
                System.out.println("Transfer fee: $" + transferFee);
            }
            checkBalance();
        }
    }

    public void depositMoney(double amount) {
        balance += amount;
        System.out.println("You have successfully deposited $" + amount);
        checkBalance();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(1000.00);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Transfer Money");
            System.out.println("4. Deposit Money");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdrawCash(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    System.out.print("Transfer to (same/other) bank: ");
                    String bankType = scanner.next();
                    atm.transferMoney(transferAmount, bankType);
                    break;
                case 4:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.depositMoney(depositAmount);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

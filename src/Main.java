import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pin =1234;
        double balance = 1000.0;
        String lastTransaction = "No transaction yet";

        System.out.println("Welcome to ATM");
        System.out.println("Enter your pin: ");
        int enteredPin = scanner.nextInt();

        if(pin != enteredPin){
            System.out.println("Entered Wrong pin... ");
            return;
        }

        System.out.println("Pin Accepted!");

        while (true){
            System.out.println("=== Main Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. View Last Transaction");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Your balance : " + balance);
                    lastTransaction = "Checked balance";
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw : ");
                    double withdrawAmount = scanner.nextInt();

                    if (withdrawAmount > balance){
                        System.out.println("Oops! Not enough money!!");
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Invalid Amount");
                    } else {
                        balance = balance - withdrawAmount;
                        lastTransaction = "Withdrawn " + withdrawAmount;
                        System.out.println("Take your cash");
                    }
                    break;

                case 3:
                    System.out.println("Enter amouont to deposit : ");
                    double depositedMoney = scanner.nextDouble();

                    if(depositedMoney <= 0){
                        System.out.println("Invalid Amount");
                    } else {
                        balance = balance + depositedMoney;
                        lastTransaction = "Deposited Money " + depositedMoney;
                        System.out.println("Deposited successfully !");
                    }
                    break;

                case 4:
                    System.out.println("Last transaction : " + lastTransaction);
                    break;

                case 5:
                    System.out.println("Thank you for using ATM");
                    scanner.close();
                    System.exit(0);
            }
        }






    }
}
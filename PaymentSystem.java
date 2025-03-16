import java.util.Scanner;

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionLogger logger = new TransactionLogger();
        PaymentFactory factory = null;
        System.out.println("Select Payment Method: 1. Credit Card 2. PayPal 3. Crypto");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: factory = new CreditCardPaymentFactory(); break;
            case 2: factory = new PayPalPaymentFactory(); break;
            case 3: factory = new CryptoPaymentFactory(); break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        PaymentMethod payment = new PaymentValidatorAdapter(factory.createPaymentMethod());
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        if (payment.processPayment(amount)) {
            logger.logTransaction("Payment of $" + amount + " successful.");
        } else {
            logger.logTransaction("Payment of $" + amount + " failed.");
        }
        logger.showTransactionHistory();
    }
}
import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {
    private List<String> transactionHistory = new ArrayList<>();

    public void logTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define exchange rates
        double usdToInr = 75.0;
        double eurToInr = 85.0;
        double gbpToInr = 100.0;
        
        // Get the amount and currency from the user
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();
        
        System.out.println("Enter the source currency (USD, EUR, GBP): ");
        String sourceCurrency = scanner.next().toUpperCase();
        
        System.out.println("Enter the target currency (INR): ");
        String targetCurrency = scanner.next().toUpperCase();
        
        double convertedAmount = 0.0;
        
        // Perform currency conversion
        if (targetCurrency.equals("INR")) {
            switch (sourceCurrency) {
                case "USD":
                    convertedAmount = amount * usdToInr;
                    break;
                case "EUR":
                    convertedAmount = amount * eurToInr;
                    break;
                case "GBP":
                    convertedAmount = amount * gbpToInr;
                    break;
                default:
                    System.out.println("Invalid source currency.");
                    return;
            }
        } else {
            System.out.println("Invalid target currency.");
            return;
        }
        
        System.out.printf("Converted amount: %.2f %s\n", convertedAmount, targetCurrency);
    }
}

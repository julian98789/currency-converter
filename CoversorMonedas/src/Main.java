import model.CurrencyConverter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();
        int op;

        do {
            System.out.println("\n********************************************************\n");
            System.out.println("1) Dollar =>> Argentine peso");
            System.out.println("2) Argentine peso =>> Dollar");
            System.out.println("3) Dollar =>> Brazilian real");
            System.out.println("4) Brazilian real =>> Dollar");
            System.out.println("5) Dollar =>> Colombian peso");
            System.out.println("6) Colombian peso =>> Dollar");
            System.out.println("7) Go out");
            System.out.println("\nEnter a valid option: ");
            System.out.println("********************************************************");


            if (input.hasNextInt()) {
                op = input.nextInt();
                switch (op) {
                    case 1:
                        currencyConverter.conversion("USD", "ARS");
                        break;
                    case 2:
                        currencyConverter.conversion("ARS", "USD");
                        break;
                    case 3:
                        currencyConverter.conversion("USD", "BRL");
                        break;
                    case 4:
                        currencyConverter.conversion("BRL", "USD");
                        break;
                    case 5:
                        currencyConverter.conversion("USD", "COP");
                        break;
                    case 6:
                        currencyConverter.conversion("COP", "USD");
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Please enter a valid option (1-7).");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid option (1-7).");
                input.next();
                op = 0;
            }
        } while (op != 7);
    }
}

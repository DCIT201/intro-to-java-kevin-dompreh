import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Prompt the user to select an option
        int choice;
        while (true) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                }
            }
            System.out.println("Invalid input. Please enter 1 or 2.");
            scanner.nextLine(); // Clear invalid input
        }

        // Prompt the user to enter a temperature value
        double temperature = 0.0;
        while (true) {
            System.out.print("Enter the temperature value: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break;
            }
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Clear invalid input
        }

        // Perform the conversion
        double convertedTemperature = 0.0;
        if (choice == 1) {
            // Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f°C is equal to %.2f°F%n", temperature, convertedTemperature);
        } else {
            // Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F is equal to %.2f°C%n", temperature, convertedTemperature);
        }

        // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class TemperatureConverter {
    private static double temperature;

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        // Validate the user's choice
        int choice;
        while (true) {
            try {
                System.out.println("Enter your choice (1 / 2): ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2)
                    break;
                else
                    System.out.println("Invalid input");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a numeric value.");
            }
        }
        // perform the conversion based on the user's input
        double convertedTemperature;
        if (choice == 1) {
            // Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf(String.valueOf(temperature), convertedTemperature);
        } else {
            // Fahrenheit to celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf(String.valueOf(temperature), convertedTemperature);
        }

        // close the scanner
        scanner.close();
        System.out.println("Hope you had a great user experience");
    }

    public static void setTemperature(double temperature) {
        TemperatureConverter.temperature = temperature;
    }
}
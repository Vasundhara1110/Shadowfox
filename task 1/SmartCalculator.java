import java.util.Scanner;

public class SmartCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Smart Calculator ===");
            System.out.println("1. Basic Arithmetic (+ - * /)");
            System.out.println("2. Scientific (Square Root, Power)");
            System.out.println("3. Unit Conversion (Celsius to Fahrenheit)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    basicArithmetic(input);
                    break;
                case 2:
                    scientificOperations(input);
                    break;
                case 3:
                    unitConversion(input);
                    break;
                case 0:
                    System.out.println("Thank you for using this Calculator");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 0);

        input.close();
    }

    static void basicArithmetic(Scanner input) {
        System.out.print("Enter first number: ");
        double x = input.nextDouble();
        System.out.print("Enter second number: ");
        double y = input.nextDouble();

        System.out.println("Addition: " + (x + y));
        System.out.println("Subtraction: " + (x - y));
        System.out.println("Multiplication: " + (x * y));
        if (y != 0) {
            System.out.println("Division: " + (x / y));
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    static void scientificOperations(Scanner input) {
    System.out.println("1. Square Root\n2. Power");
    System.out.print("Choose option: ");
    int option = input.nextInt();

    switch (option) {
        case 1:
            System.out.print("Enter number to find square root: ");
            double num = input.nextDouble();
            if (num >= 0) {
                double result = Math.sqrt(num);
                System.out.println("Square Root of " + num + " is: " + result);
            } else {
                System.out.println("Cannot find square root of negative number!");
            }
            break;

        case 2:
            System.out.print("Enter base: ");
            double base = input.nextDouble();
            System.out.print("Enter exponent: ");
            double exp = input.nextDouble();
            double powResult = Math.pow(base, exp);
            System.out.println(base + " raised to the power of " + exp + " is: " + powResult);
            break;

        default:
            System.out.println("Invalid choice!");
    }
}

    static void unitConversion(Scanner input) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}



         
         
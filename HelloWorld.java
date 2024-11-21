import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        // Predefined numbers
        double num1 = 12.5;
        double num2 = 3.5;

        // Example operation (change this as needed: +, -, *, /)
        char operation = '+';
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double result;

        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Operation: " + operation);

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operation. Please use +, -, *, or /.");
        }
    }
}

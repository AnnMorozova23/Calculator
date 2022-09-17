import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        double num1 = getNumbers();
        double num2 = getNumbers();
        char operation = getOperation();
        System.out.println("The result is: " + getResult(num1, num2, operation));
    }


    private static double getResult(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Dividing by 0 is undefined");
                    result = getResult(getNumbers(), getNumbers(), getOperation());
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Wrong operation, please try again");
                result = getResult(num1, num2, getOperation());
        }
        return result;
    }

    private static char getOperation() {
        System.out.print("Enter needs operation (+, - , * , /): ");
        char op = scanner.next().charAt(0);
        return op;
    }

    private static double getNumbers() {
        System.out.print("Enter number: ");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Wrong! Please, enter numbers again");
            scanner.next();
            num = getNumbers();
        }
        return num;
    }
}





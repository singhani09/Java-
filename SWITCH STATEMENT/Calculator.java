public class Calculator {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 4;
        char operator = '*';

        double result = 0;
        boolean valid = true;

        switch (operator) {
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
                    System.out.println("Error: Division by zero");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid operator");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}
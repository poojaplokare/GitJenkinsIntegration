package utility;


import org.testng.annotations.Test;

public class Calculator {
	
	@Test
	public void testCalculator() {
		//Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter the first number: ");
        double num1 = 10;

        //System.out.println("Enter the second number: ");
        double num2 = 20;

        //System.out.println("Select operation (+, -, *, /): ");
        char operation = '+';

        double result;

        switch (operation) {
            case '+':
            	System.out.println("Addition");
                result = num1 + num2;
                break;
            case '-':
            	System.out.println("Subtraction");
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);

        //scanner.close();
		
		
	}
}

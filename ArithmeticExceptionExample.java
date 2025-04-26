
import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.println("Enter first number (numerator):");
            int a = input.nextInt();
            
            System.out.println("Enter second number (denominator):");
            int b = input.nextInt();
            
           
            int result = a / b;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close(); 
        }
    }
}
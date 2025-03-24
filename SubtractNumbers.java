import java.util.Scanner;

public class SubtractNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        if (num2 <= num1) {
            int result = num1 - num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Second number must be smaller than or equal to the first number.");
        }
        
        scanner.close();
    }
}

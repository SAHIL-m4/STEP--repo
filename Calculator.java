import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("||==============================================||");
        System.out.println("||                CALCULATOR                    ||");
        System.out.println("||==============================================||");
        System.out.print("\n");
        System.out.print("   Enter  1st  number : ");
        double num1 = sc.nextDouble();
        System.out.print("   Enter  2nd  number : ");
        double num2 = sc.nextDouble();
        System.out.println("||==============================================||");
        System.out.print("   Enter an operator ( + , - , * , / , % ) : ");
        char operator = sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("ADDITION : " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("SUBTRACTION : " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(" MULTIPLICATION : " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("DIVISION : " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
            case '%':
                result = num1 % num2;
                System.out.println("REMAINDER : +result ");
                break;
            default:
                System.out.println("Invalid operator!");
        }
        System.out.println("||===============================================||");
        sc.close();
    }
}
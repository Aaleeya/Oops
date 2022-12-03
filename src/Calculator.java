import java.util.Scanner;

public class Calculator {
    public static double num;
    public static void main(String[] args){
        double num1, num2;
        String operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        num1 = input.nextDouble();
        System.out.println("Enter 2nd number: ");
        num2 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter the operator: ");
        operator = input.nextLine();
        switch (operator){
            case "+": add(num1, num2);
            break;
            case "-": subtract(num1, num2);
            break;
            case "*" : multiple(num1, num2);
            break;
            case "/" : divide(num1, num2);
            break;
            default :
                System.out.println("Enter a valid number");
            break;
        }
        System.out.println("The result is: " + num);
    }

    public static double add(double num1, double num2){
        return num = num1 + num2;
    }

    public static double subtract(double num1, double num2){
        return num = num1 - num2;
    }

    public static double multiple(double num1, double num2){
        return num = num1 * num2;
    }

    public static double divide(double num1, double num2){
        return num = num1 / num2;
    }
}

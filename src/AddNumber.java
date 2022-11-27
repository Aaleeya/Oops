import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = Integer.parseInt(number.nextLine());
        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(number.nextLine());
        System.out.println("The 2 numbers are: \n" + "Num1: " + num1 + " Num2: " + num2);
        int num = num1 + num2;
        System.out.println("The sum of the 2 numbers is: " + num);
    }
}

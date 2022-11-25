import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args){
        int number;
        double decimalNumber;
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = input.nextInt();
        input.nextLine();
        System.out.println("The number entered by user is: "+number);

        System.out.println("Enter a String: ");
        text = input.nextLine();
        System.out.println("The String entered by user is: "+text);

        System.out.println("Enter a decimal number: ");
        decimalNumber = input.nextDouble();
        System.out.println("The decimal number entered by user is: "+decimalNumber);
    }
}

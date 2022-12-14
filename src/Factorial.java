import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number, fact=1;
        System.out.println("Enter an integer to calculate it's factorial: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number < 0){
            System.out.println("Enter a non-negative number");
        }
        else{
            for(int i=1; i<= number; i++){
                fact = number *i;
                System.out.println("The factorial of "+number+" is = "+fact);
            }
        }
    }
}

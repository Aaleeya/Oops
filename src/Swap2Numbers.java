import java.util.Scanner;

public class Swap2Numbers {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = Integer.parseInt(number.nextLine());
        //number.nextLine();
        System.out.println("Enter second number: ");
        int num2 = Integer.parseInt(number.nextLine());
        System.out.println("Before swapping: \n"+"Num1:"+num1+" Num2: "+num2);
        int swap= num1;
        num1 = num2;
        num2 = swap;
        System.out.println("After swapping: \nNum1:"+num1+" Num2: "+num2);
    }
}

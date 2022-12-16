import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        while((n= input.nextInt()) != -1){
            System.out.println("You have entered: "+n);
            System.out.println("Enter an integer: ");
        }
        System.out.println("Out of loop");
    }
}

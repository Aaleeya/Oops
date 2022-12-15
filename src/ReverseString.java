import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String text;
        System.out.println("Enter a String: ");
        Scanner inputString = new Scanner(System.in);
        text = inputString.nextLine();
        StringBuilder input = new StringBuilder();
        input.append(text);
        input.reverse();
        System.out.println("The reversed string is: "+input);
    }
}

import java.util.Scanner;mport java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a 3 digit integer: ");

        int number = input.nextInt();

        //Extracting the first digit
        int firstDigit = (int)(number / 100);

        // Extracting the last digit
        int lastDigit = number % 10;

        int midDigit = (int)(number % 100 / 10);

        if (firstDigit == lastDigit)
            System.out.print("The number is a palindrome");
        else System.out.print("The number is not a palindrome");

    }
}

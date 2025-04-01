import java.util.Scanner;

public class QuotientMethod {
    public static int quotient(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Denominator is zero, WRONG");
            System.exit(1);
        }
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = quotient(num1, num2);
        System.out.println("Quotient of " + num1 + " and " + num2 + " is " + result);
    }
}

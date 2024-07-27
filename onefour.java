import java.util.Scanner;

public class  onefour{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dividend: ");
        int dividend = scanner.nextInt();

        System.out.println("Enter divisor: ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
        scanner.close();
    }
}
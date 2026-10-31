
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter numbers (0 to stop):");

        int number = input.nextInt();

        while (number != 0) {

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            number = input.nextInt();
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        input.close();
    }
}

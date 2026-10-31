
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        int negativeCount = 0;

        try {
            File file = new File("duomenys.txt");
            Scanner input = new Scanner(file);

            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                int temperature = input.nextInt();

                if (temperature < 0) {
                    negativeCount++;
                }
            }

            input.close();

            if (negativeCount == 0) {
                System.out.println("No negative temperatures recorded");
            } else {
                System.out.println("Days with negative temperatures: " + negativeCount);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

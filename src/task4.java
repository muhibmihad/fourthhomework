
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        int count = 0;

        try {
            File file = new File("duomenys.txt");
            Scanner input = new Scanner(file);

            int n = input.nextInt();

            if (n > 0) {
                int previous = input.nextInt();

                for (int i = 1; i < n; i++) {
                    int current = input.nextInt();

                    if (current < previous) {
                        count++;
                    }

                    previous = current;
                }
            }

            input.close();

            System.out.println(count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

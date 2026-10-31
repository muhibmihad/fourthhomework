
public class task1 {
    public static void main(String[] args) {

        int p = 800;  // Laptop price
        int s = 250;  // Initial savings
        int m = 75;   // Weekly savings
        int k = 0;    // Number of weeks

        while (s < p) {
            s = s + m;
            k++;
        }

        System.out.println("k = " + k);
    }
}

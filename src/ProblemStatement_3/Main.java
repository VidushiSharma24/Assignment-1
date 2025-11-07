package ProblemStatement_3;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of binary values:");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter binary values (0 or 1):");

        // Take input manually
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

            if (nums[i] != 0 && nums[i] != 1) {
                System.out.println("Invalid input! Only 0 and 1 allowed.");
                return;
            }
        }

        // Create object of MinFlipsCalculator class
        MinFlipsCalculator calculator = new MinFlipsCalculator();
        int result = calculator.minFlips(nums);

        System.out.println("Minimum flips required: " + result);
    }
}

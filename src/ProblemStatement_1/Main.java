package ProblemStatement_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter energy costs to travel between cities:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input initial energy
        System.out.print("Enter initial energy: ");
        int initialEnergy = sc.nextInt();

        // Function call
        int result = EfficientTraveler.farthestCity(nums, initialEnergy);

        System.out.println("Farthest city index reachable: " + result);
    }
}


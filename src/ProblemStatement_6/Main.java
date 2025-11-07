package ProblemStatement_6;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of walls: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter time taken to paint each wall (space separated):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MinimalistPainter.minimalistPainter(arr);
    }
}

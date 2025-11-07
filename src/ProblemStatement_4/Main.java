package ProblemStatement_4;

import java.util.Scanner;
// problem 4 main
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create object of OddOneOut class
        OddOneOut obj = new OddOneOut();
        obj.findUniqueElements(arr);
    }
}

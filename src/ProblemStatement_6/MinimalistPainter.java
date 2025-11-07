package ProblemStatement_6;
// problem 6
public class MinimalistPainter {
    public static void minimalistPainter(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int time = arr[i];
            sum += time;
            if (time > max) {
                max = time;
            }
        }

        int result = sum - max;
        System.out.println("Minimum total time after skipping one wall: " + result);
    }
}

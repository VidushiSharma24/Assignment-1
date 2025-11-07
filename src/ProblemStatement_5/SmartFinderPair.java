package ProblemStatement_5;

public class SmartFinderPair {
    public static boolean smartFinderPair(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    return true;
                }
            }
        }
        System.out.println("No such pair found!");
        return false;
    }
}

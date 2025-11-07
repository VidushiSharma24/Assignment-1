package ProblemStatement_3;
// problem 3
public class MinFlipsCalculator {
    public int minFlips(int nums[]) {
        int count0 = 0, count1 = 0;

        // Count zeros and ones manually
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count0++;
            else
                count1++;
        }

        // Find smaller number manually (without Math.min)
        int min;
        if (count0 < count1)
            min = count0;
        else
            min = count1;

        return min;
    }
}

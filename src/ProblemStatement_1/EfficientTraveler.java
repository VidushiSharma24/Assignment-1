package ProblemStatement_1;
// problem 1
public class EfficientTraveler {
    public static int farthestCity(int[] nums, int initialEnergy) {
        int energy = initialEnergy;

        for (int i = 0; i < nums.length; i++) {
            energy -= nums[i];
            if (energy < 0) {
                return i;
            }
        }
        return nums.length - 1; // reached all cities
    }
}

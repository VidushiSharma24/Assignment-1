package ProblemStatement_2;
//problem 2
public class StandOutSum {
    int totalSum ;
    int [] nums;

    StandOutSum(int [] nums,int totalSum) {
        this.nums = nums;
        this.totalSum = totalSum;
    }
    public int findIndex() {
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }


        int prefixSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int suffixSum = totalSum - prefixSum - nums[i];
            if (prefixSum == suffixSum) {
                return i;  // found index
            }
            prefixSum += nums[i];
        }
        return -1; // not found
    }
}

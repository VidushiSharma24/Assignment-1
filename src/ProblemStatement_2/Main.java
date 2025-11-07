package ProblemStatement_2;
// problem 2 main
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, -1, 8, 4};
        StandOutSum s1 = new StandOutSum(nums,0);

        int res = s1.findIndex();
        System.out.println(res);
    }
}

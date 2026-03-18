
public class TaskThree {
    public static int findLargest(int.. nums) {
        int max = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
}
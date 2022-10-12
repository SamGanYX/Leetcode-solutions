class Solution {
    public int largestPerimeter(int[] nums) {
        swapMaximalElement(nums, nums.length - 1);
        swapMaximalElement(nums, nums.length - 2);
        swapMaximalElement(nums, nums.length - 3);

        for (int i = nums.length - 1; i >= 2; i--) {

            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            } else if (i > 2)
                swapMaximalElement(nums, i - 3);
        }
        return 0;
    }

    public static void swapMaximalElement(int[] nums, int index) {
        int max = 0;
        int maxIndex = -1;

        for (int i = 0; i <= index; i++) {

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int temp = nums[index];
        nums[index] = max;
        nums[maxIndex] = temp;
    }
}
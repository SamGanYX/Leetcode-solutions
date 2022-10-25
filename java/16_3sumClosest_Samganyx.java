class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        
        for(int i=0; i < nums.length - 2; i++) {
            int sum = nums[i] + nums[nums.length-1] + nums[nums.length-2];
            if (sum < target) {
                result = sum;
                continue;
            }
            sum = nums[i] + nums[i+1] + nums[i+2];
            if (sum > target) {
                if (sum - target < minDiff) {
                    result = sum;
                    minDiff = sum - target;
                }
                break;
            }
            
            int l = i+1;
            int r = nums.length - 1;
            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
                int diff = Math.abs(sum - target);
                if (diff < minDiff) {
                    result = sum;
                    minDiff = diff;
                }
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
        
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length < 3) {
			return result;
		}
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				twoSum(nums, i, result);
			}
		}
		return result;
	}

	private void twoSum(int[] nums, int current, List<List<Integer>> result) {
		int left = current + 1;
		int right = nums.length - 1;

		int curr = 0;

		while (right > left) {
			curr = nums[current] + nums[left] + nums[right];
			if (curr < 0) {
				left++;
			} else if (curr > 0) {
				right--;
			} else {
				result.add(Arrays.asList(nums[current], nums[left], nums[right]));
				left++;
				right--;
				while(left < right && nums[left] == nums[left - 1]) {
					left++;
				}
			}
		}
	}
}
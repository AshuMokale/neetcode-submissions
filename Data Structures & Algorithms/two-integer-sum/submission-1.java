class Solution {
    public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int k = i + 1; k < nums.length; k++) {
				int sum = nums[i] + nums[k];
				if (sum == target)
                    return new int[] { i, k };
			}
		}
		return new int[] {};
    }
}

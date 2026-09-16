class Solution {
    public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> sum = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int difference = target - nums[i];
			if (sum.containsKey(difference)) {
				int index = sum.get(difference);
                return new int[] { index, i };
			}
			sum.put(nums[i], i);

		}
		return new int[] {};
    }
}

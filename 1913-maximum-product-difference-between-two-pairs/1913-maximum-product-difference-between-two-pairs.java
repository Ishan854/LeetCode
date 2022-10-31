class Solution {
    public int maxProductDifference(int[] nums) {
       Arrays.sort(nums);
        int maxPair = nums[nums.length-1] * nums[nums.length-2];
        int minPair = nums[0] * nums[1];
        return maxPair - minPair;
    }
}
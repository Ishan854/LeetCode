class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int start = 0;
        int n = nums.length;
        int end = n -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==original){
                original *=2;
                start = mid + 1;
                end = n-1;
            }
            else if(nums[mid]>=original){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return original;
    }
}
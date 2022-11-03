class Solution {
    public int maxProduct(int[] nums) {
        int m = Integer.MIN_VALUE;
        int n = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m){
                n = m;
                m = nums[i];
            }
            else if(nums[i] >= n){
                n = nums[i];
            }
        }
        return (m-1)*(n-1);
    }
}
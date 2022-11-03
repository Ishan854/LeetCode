class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        // int m = Integer.MIN_VALUE;
        // int n = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>m){
        //         n = m;
        //         m = nums[i];
        //     }
        //     else if(nums[i] >= n){
        //         n = nums[i];
        //     }
        // }
        // return (m-1)*(n-1);
    }
}
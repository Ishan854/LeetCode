class Solution {
    public int subsetXORSum(int[] nums) {
     int count = 0 ;
        for(int num : nums){
            count |= num;
        }
        return  count * (int)Math.pow(2,nums.length-1);
    }
}
class Solution {
    public int minOperations(int[] nums) {
        // int sum = 0;
        int n = nums.length;
        int count=0;
        for(int i =1;i<n;i++){
            if(nums[i]<=nums[i-1]){
              int change = nums[i-1]-nums[i]+1;
                count += change;
                nums[i] += change;
            }
            
        }
        return count;
    
}
}
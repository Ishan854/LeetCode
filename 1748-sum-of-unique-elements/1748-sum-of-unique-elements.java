class Solution {
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101];
        int count=0;
        for(int i=0; i<nums.length; i++)
            freq[nums[i]]++;
        for(int i=0; i<nums.length; i++){
            if(freq[nums[i]]==1)
            count+=nums[i];
        }
        return count;
    }
}
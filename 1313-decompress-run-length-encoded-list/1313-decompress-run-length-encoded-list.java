class Solution {
    public int[] decompressRLElist(int[] nums) {
        int freqSize = 0;
        for(int i =0;i<nums.length;i=i+2){
        freqSize +=nums[i];
        }
        int[] arr = new int[freqSize];
        int k =0;
        for(int i =0; i<nums.length;i=i+2){
            for(int j = 0;j<nums[i];j++){
                arr[k]  = nums[i+1];
                k++;
            }
        }
        return arr;
    }
}
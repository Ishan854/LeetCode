class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int start =0;
        int end = nums.length-1;
        for(int i : nums){
            if(i%2==0){
                arr[start] = i;
                start++;
            }
            else{
                arr[end] = i;
                end--;
            }
        }
        return arr;
    }
}
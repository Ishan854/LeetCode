class Solution {
    public boolean divideArray(int[] nums) {
        int n =nums.length;
        int visited[] = new int[501];
        for(int i =0;i<n;i++){
            visited[nums[i]]++;
        }
        for(int f : visited){
            if(f%2!=0){
                return false;
            }
        }
        return true;
    }
}
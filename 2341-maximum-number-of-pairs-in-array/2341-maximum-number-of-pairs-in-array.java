class Solution {
    public int[] numberOfPairs(int[] nums) {
        int arr[] = new int[101];
        for(int i:nums) arr[i]++;
        int pairs = 0;
        int leftover = 0;
        for(int i : arr){
            pairs += i/2;
            leftover += i%2;
    }
        return new int[]{pairs,leftover};
    }
}
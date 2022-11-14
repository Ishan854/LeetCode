class Solution {
    public int gcd(int a, int b){
        if(b>a)
            return gcd(b,a);
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    public int findGCD(int[] nums) {
        int min;
        int max;
        int n = nums.length;
        Arrays.sort(nums);
        min = nums[0];
        max = nums[n-1];
        return gcd(min, max);
    }
}
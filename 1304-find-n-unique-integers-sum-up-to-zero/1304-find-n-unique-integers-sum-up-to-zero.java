class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int left = 0;
        int right = n-1;
        int start = 1;
        while(left < right){
            arr[left++] = start;
            arr[right--] = -start;
            start++;
        }
        return arr;
    }
}
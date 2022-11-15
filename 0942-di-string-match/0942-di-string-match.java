class Solution {
    public int[] diStringMatch(String s) {
       int n = s.length();
        int low = 0;
        int high = n;
        int k = 0;
        int arr[] = new int[n+1];
        for(int i =0;i<n;i++){
            if(s.charAt(i)== 'D'){
                arr[k++] = high--;
            }
            else {
                arr[k++] = low++;
            }
        }
        arr[k++] = high;
        return arr;
    }
}
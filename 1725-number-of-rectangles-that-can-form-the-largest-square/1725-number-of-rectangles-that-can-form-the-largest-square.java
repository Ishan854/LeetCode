class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int cnt =0; 
        int max = 0;
        for(int[] rect : rectangles){
            int side = Math.min(rect[0],rect[1]);
            if(side > max){
                cnt = 1;
                max = side;
            }
            else if(side == max){
                cnt++;
            }
        }
        return cnt;
    }
}
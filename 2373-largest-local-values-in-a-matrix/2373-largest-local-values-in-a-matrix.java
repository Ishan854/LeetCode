class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for(int i =0;i<n-2;i++){
            for(int j =0;j<n-2;j++){
                ans[i][j] = func(i,j,grid);
            }
        }
        return ans;
    }
        
        
        public static int func(int st, int sec, int[][] grid){
            int maxElement = Integer.MIN_VALUE;
            for(int i =st;i<=2+st;i++){
                for(int j = sec;j<=2+sec;j++){
                    if(grid[i][j] > maxElement){
                        maxElement = grid[i][j];
                    }
                }
            }
            return maxElement;
        }
        
    }

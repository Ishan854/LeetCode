class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;
        for(int i =0;i<row;i++){
            for(int j =0;j<(col+1)/2;j++){
                int temp = image[i][j]^1;
                image[i][j] = image[i][col-j-1]^1;
                image[i][col-j-1] = temp;
            }
        }
        return image;
    }
}
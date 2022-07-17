class Solution {
  
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      int baseColor = image[sr][sc];
      if(baseColor != color ){
        floodColor(image, sr, sc, baseColor, color );    
      }
       return image;
    }
  
  void floodColor(int[][] image, int row, int col, int baseColor, int color){
    if(image[row][col] == baseColor){
       image[row][col] = color;
      deepFlow(image, row, col, baseColor, color);
    }
  }
  
 void deepFlow(int[][] image, int row, int col, int baseColor, int color){
      if(row >= 1) floodColor(image, row-1, col, baseColor, color);
      if(col >= 1) floodColor(image, row, col-1, baseColor, color);
      if(row + 1 < image.length) floodColor(image, row+1, col, baseColor, color);
      if(col + 1 < image[0].length) floodColor(image, row, col+1, baseColor, color);
 }
}
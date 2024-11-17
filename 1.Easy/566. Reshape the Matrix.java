class Solution {
  public int[][] matrixReshape(int[][] mat, int r, int c) {
    int row = mat.length;
    int col = mat[0].length;

    if (row * col != r * c) {
      return mat;
    }
    int[][] res = new int[r][c];
    int resRow = 0;
    int resCol = 0;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        res[resRow][resCol] = mat[i][j];
        resCol++;
        if (resCol == c) {
          resRow++;
          resCol = 0;
        }
      }
    }
    return res;
  }
}
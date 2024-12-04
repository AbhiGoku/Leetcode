class Solution {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> res = new ArrayList<>();
    char[][] board = new char[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = '.';
      }
    }
    nQueens(n, res, board, 0);
    return res;

  }

  private void nQueens(int n, List<List<String>> res, char[][] board, int row) {
    if (row == n) {
      saveToBoard(board, n, res);
      return;
    }

    for (int i = 0; i < n; i++) {
      if (isSafe(board, row, i, n)) {
        board[row][i] = 'Q';
        nQueens(n, res, board, row + 1);
        board[row][i] = '.';
      }
    }
  }

  private boolean isSafe(char[][] board, int row, int col, int n) {
    // horizontal
    for (int i = 0; i < n; i++) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }
    // vertical
    for (int i = 0; i < n; i++) {
      if (board[row][i] == 'Q') {
        return false;
      }
    }
    // diagonal left
    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    // diagonal right
    for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  private void saveToBoard(char[][] board, int n, List<List<String>> res) {
    List<String> newBoard = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String result = "";
      for (int j = 0; j < n; j++) {
        result += String.valueOf(board[i][j]);
      }
      newBoard.add(result);

    }
    res.add(newBoard);
  }
}
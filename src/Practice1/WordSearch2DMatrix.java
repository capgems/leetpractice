package Practice1;

public class WordSearch2DMatrix {
    static boolean[][] visited;

    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;
        visited = new boolean[row][col];

        for (int r = 0; r < board.length; r++) {

            for (int c = 0; c < board[r].length; c++) {
               //important
                if (word.charAt(0) == board[r][c] && searchWord(r, c, 0, board, word)) {
                    return true;
                }

            }
        }
        return false;
    }

    boolean searchWord(int row, int col, int index, char[][] board, String word) {

        if (index == word.length()) {
            return true; //base case.
        }


        if (
                row < 0
                        || row >= board.length
                        || col < 0
                        || col >= board[row].length
                        || word.charAt(index) != board[row][col]
                        || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        if (
                        searchWord(row, col + 1, index + 1, board, word) ||
                        searchWord(row, col - 1, index + 1, board, word) ||
                        searchWord(row + 1, col, index + 1, board, word) ||
                        searchWord(row - 1, col, index + 1, board, word)
        ) {

            return true;
        }

        visited[row][col] = false;
        return false;
    }
}
package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer column) {
        String[] col = new String[board.length];

        for(int row = 0; row < board.length; row++) {
            col[row] = board[row][column];
        }

        return col;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);

        return allValuesTheSame(row);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] row = getColumn(columnIndex);

        return allValuesTheSame(row);
    }

    private Boolean allValuesTheSame(String[] row) {
        for (int i = 1; i < row.length; i++) {
            if (!row[i].equals(row[0])) {
                return false;
            }
        }

        return true;
    }


    public String getWinner() {
        //check row
        for(int i = 0; i < board.length; i++) {
            if (isRowHomogenous(i)) {
                return board[i][0];
            }
        }

        //check column
        for(int i = 0; i < board.length; i++) {
            if (isColumnHomogeneous(i)) {
                return board[0][i];
            }
        }

        //left to right
        String[] diagonal = getDiagonal();
        if (allValuesTheSame(diagonal)) {
            return diagonal[0];
        }

        //right to left
        String[] otherDiagonal = getOtherDiagonal();
        if (allValuesTheSame(otherDiagonal)) {
            return otherDiagonal[0];
        }

        return null;
    }

    public String[] getDiagonal(){
        String[] diagonal = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            diagonal[i] = board[i][i];
        }
        return diagonal;
    }

    public String[] getOtherDiagonal(){
        String[] diagonal = new String[board.length];
        for (int i = 0; i < board.length; i++) {
            int row = board.length - 1 - i;
            diagonal[i] = board[row][i];
        }
        return diagonal;
    }


    public String[][] getBoard() {
        return board;
    }
}

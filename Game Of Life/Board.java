import java.util.*;

/**
 * 여기에 Board 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Board {
    private int row, col;
    private boolean[][] board;
    
    public Board() {
        this.row = 10;
        this.col = 30;
        this.board = new boolean[row][col];
    }
    
    public void printBoard() {
        for (int r = 0; r < row; ++r) {
            for (int c = 0; c < col; ++c) {
                System.out.print(board[r][c] ? "#" : " ");
            }
            System.out.println();
        }
    }
    
    public void initBoard(double ratio) {
        Random random = new Random(System.currentTimeMillis());
        
        for (int r = 0; r < row; ++r) {
            for (int c = 0; c < col; ++c) {
                board[r][c] = random.nextDouble() < ratio;  
            }
        }
    }
    
    public void moveR() {
        boolean[][] nBoard = new boolean[row][col];
        
        for (int c = 0; c < col; ++c) {
            for (int r = 0; r < row; ++r) {
                nBoard[r][(c + 1) % col] = board[r][c];
            }
        }
        
        this.board = nBoard;
    }
}

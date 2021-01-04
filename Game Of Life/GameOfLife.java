import java.util.*;

/**
 * Game of Life Main class
 * 
 * @author Kevin Mun
 * @version 0.1
 */
public class GameOfLife {
    
    private int row, col;
    private boolean[][] board;
    
    public GameOfLife() {
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
    
    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.initBoard(0.3); 
        gameOfLife.printBoard(); 
    }
}


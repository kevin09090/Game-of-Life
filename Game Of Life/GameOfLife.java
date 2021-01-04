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
    
    private void moveR() {
        boolean[][] nBoard = new boolean[row][col];
        
        for (int c = 0; c < col; ++c) {
            for (int r = 0; r < row; ++r) {
                nBoard[r][(c + 1) % col] = board[r][c];
            }
        }
        
        this.board = nBoard;
    }
    
    public void start(){
        Scanner scanner = new Scanner(System.in);  
        
        while(!"quit".equals(scanner.nextLine())) {
            printBoard();
            moveR();
        }
    }
    
    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.initBoard(0.3); 
        gameOfLife.start();
    }
}


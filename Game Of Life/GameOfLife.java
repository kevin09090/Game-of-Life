import java.util.*;

/**
 * Game of Life Main class
 * 
 * @author Kevin Mun
 * @version 0.1
 */
public class GameOfLife {
    private Board board;
    
    public GameOfLife() {
        this.board = new Board();
        board.initBoard(0.3);
    }
    
    public void start(){
        Scanner scanner = new Scanner(System.in);  
        
        while(!"quit".equals(scanner.nextLine())) {
            board.printBoard();
            board.moveR();
        }
    }
    
    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.start();
    }
}


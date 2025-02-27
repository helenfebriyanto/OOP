import java.util.*;

public class TicTacToe {
    private Board board;
    private Player player1;
    private Player player2;
    public Scanner scanner;
    private Player currentPlayer;

    public TicTacToe(){
        this.board = new Board();
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        scanner = new Scanner(System.in);
        playGame();
    }
    public void playGame(){
        while (true) {
            board.printBoard();
            System.out.println("Player " +currentPlayer.getPlayer()+" turn");
            System.out.println("Please input row and column : ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(board.placeMove(row, col, currentPlayer.getPlayer())){
                if(board.checkWin(currentPlayer.getPlayer())){
                    board.printBoard();
                    System.out.println("Player "+currentPlayer.getPlayer() +" wins!");
                    break;
                } else if(board.isFull()){
                    board.printBoard();
                    System.out.println("It's draw!");
                    break;
                }
                if(currentPlayer == player1){
                    currentPlayer=player2;
                } else {
                    currentPlayer=player1;
                }
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        new TicTacToe();
    }
}

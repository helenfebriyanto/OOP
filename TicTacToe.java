import java.util.*;

public class TicTacToe {
    char[][] board;
    char currentPlayer;
    Scanner scanner;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        playGame();
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean full() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true;
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                return true;
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
            return true;
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
            return true;
        return false;
    }

    public void playGame() {
        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard();
        
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your row (0-2): ");
            int row = scanner.nextInt();
            System.out.println("Player " + currentPlayer + ", enter your column (0-2): ");
            int col = scanner.nextInt();
            
            if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-') {
                System.out.println("Invalid move, try again.");
                continue;
            }
            
            board[row][col] = currentPlayer;
            printBoard();
            
            if (checkWin()) {
               System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            
            if (full()) {
                System.out.println("It's a draw!");
                break;
            }
            
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
    
    public static void main(String[] args) {
        new TicTacToe();
    }
}

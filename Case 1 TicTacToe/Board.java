public class Board {
    public char board[][];

    public Board(){
        board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='-';
            }
        }
    }

    public void printBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isFull(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]=='-') return false;
            }
        }
        return true;
    }

    public boolean placeMove(int row, int col, char player){
        if(row>=3 || col >= 3 || row<0 || col<0 || board[row][col]!='-'){
            System.out.println("Invalid move, please try again");
            return false;
        }
        board[row][col]=player;
        return true;
    }

    public boolean checkWin(char player){
        for (int i = 0; i < board.length; i++) {
            if(board[i][0] == player && board[i][1]== player && board[i][2]==player){
                return true;
            }
            if(board[0][i]==player && board[1][i]==player && board[2][i]==player){
                return true;
            }
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if(board[2][0] == player && board[1][1] == player && board[0][2] == player){
            return true;
        }
        return false;
    }
}

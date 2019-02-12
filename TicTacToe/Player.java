public abstract class Player
{    
    public abstract void mark(String[][] gameBoard);
    
    public boolean search(String[][] gameBoard){
        for(int i=0; i<=3; i++){
            if(gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][2] == gameBoard[i][3] && gameBoard[i][0] == gameBoard[i][3] && 
            !gameBoard[i][0].equals("_") && !gameBoard[i][1].equals("_") && !gameBoard[i][2].equals("_") && !gameBoard[i][3].equals("_")){
                return true;
            }
        }
        for(int i=0; i<=3; i++){
            if(gameBoard[1][i] == gameBoard[0][i] && gameBoard[3][i] == gameBoard[2][i] && gameBoard[1][i] == gameBoard[3][i] && 
            !gameBoard[0][i].equals("_") && !gameBoard[1][i].equals("_") && !gameBoard[2][i].equals("_") && !gameBoard[3][i].equals("_")){
                return true;
            }
        }
        if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[2][2] == gameBoard[3][3] && gameBoard[0][0] == gameBoard[3][3] && 
        !gameBoard[0][0].equals("_") && !gameBoard[1][1].equals("_") && !gameBoard[2][2].equals("_") && !gameBoard[3][3].equals("_")){
            return true;
        }
        else if(gameBoard[0][3] == gameBoard[1][2] && gameBoard[2][1] == gameBoard[3][0] && gameBoard[0][3] == gameBoard[3][0] && 
        !gameBoard[0][3].equals("_") && !gameBoard[1][2].equals("_") && !gameBoard[2][1].equals("_") && !gameBoard[3][0].equals("_")){
            return true;
        }
        else{
            return false;
        }
    }
}

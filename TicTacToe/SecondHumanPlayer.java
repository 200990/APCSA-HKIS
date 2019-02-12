import java.util.Scanner;

public class SecondHumanPlayer extends Player
{
    public SecondHumanPlayer(){}
    
    public void mark(String[][] gameBoard){
        Scanner scanner = new Scanner(System.in);
        int row, column;
        while(true){
            System.out.println("\nPlayer 2, What row do you want to mark. Please give your answer as a number");
            row = scanner.nextInt() - 1;
            System.out.println("Player 2, What column do you want to mark. Please give your answer as a number");        
            column = scanner.nextInt() - 1;
            if(row <= 3 && column <= 3 && row >= 0 && column >= 0 && gameBoard[row][column] == "_"){
                gameBoard[row][column] = "O";
                break;
            }
            else{
                System.out.println("Error! Either the space you have chosen is already marked or your values are out of range. \nPlease try again");
            }
        }
        System.out.println("\tHere is the updated gameboard");
        for (int r = 0; r < gameBoard.length; r++)
        {
            System.out.println("\t");
            for (int c = 0; c < gameBoard[r].length; c++)
            {
                System.out.print(gameBoard[r][c]);
            }
        }
    }
}


import java.util.Scanner;

public class Game
{
    private String[][] officialGameBoard = new String[4][4];
    
    public Game(){}
    
    public void startGame(){
        fillOfficialGameBoard();
        System.out.println("\nHere is your gameboard, with rows going from 1 to 4 and columns also going from 1 to 4");
        print();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nDo you want to play \"one player\" mode or \"two players\" mode (don't capitlalise any of the letters in your response)?");
        String response = scanner.nextLine();
        while(true){
            //I wrote two players response first before one player response.
            if(response.equals("two players")){
                HumanPlayer player1 = new HumanPlayer();
                SecondHumanPlayer player2 = new SecondHumanPlayer();
                player1.mark(officialGameBoard);
                if(player1.search(officialGameBoard) == true){
                    System.out.println("\n \t \tCongratulations! Player 1 wins");
                    break;
                }
                if(complete() == true){
                    System.out.println("\n \t \tGame over! It is a draw");
                    break;
                }
                player2.mark(officialGameBoard);
                if(player2.search(officialGameBoard) == true){
                    System.out.println("\n \t \tCongratulations! Player 2 wins");
                    break;
                }
                if(complete() == true){
                    System.out.println("\n \t \tGame over! It is a draw");
                    break;
                }
            }
            else if(response.equals("one player")){
                HumanPlayer player1 = new HumanPlayer();
                ComputerPlayer player2 = new ComputerPlayer();
                player1.mark(officialGameBoard);
                if(player1.search(officialGameBoard) == true){
                    System.out.println("\n \t \tCongratulations! You win");
                    break;
                }
                if(complete() == true){
                    System.out.println("\n \t \tGame over! It is a draw");
                    break;
                }
                player2.mark(officialGameBoard);
                if(player2.search(officialGameBoard) == true){
                    System.out.println("\n \t \tBad luck! The computer wins");
                    break;
                }
                if(complete() == true){
                    System.out.println("\n \t \tGame over! It is a draw");
                    break;
                }
            }
            else{
                System.out.println("Error! Please type in either \"one player\" or \"two players\"");
                response = scanner.nextLine();
            }
        }
    }
    
    public void fillOfficialGameBoard(){
        for (int r = 0; r < officialGameBoard.length; r++)
        {
            for (int c = 0; c < officialGameBoard[r].length; c++)
            {
                officialGameBoard[r][c] = "_";
            }
        }
    }
    
    public void print(){
        for (int r = 0; r < officialGameBoard.length; r++)
        {
            System.out.println("\t");
            for (int c = 0; c < officialGameBoard[r].length; c++)
            {
                System.out.print(officialGameBoard[r][c]);
            }
        }
    }
    
    public boolean complete(){
        for (int r = 0; r < officialGameBoard.length; r++)
        {
            for (int c = 0; c < officialGameBoard[r].length; c++)
            {
                if(officialGameBoard[r][c].equals("_")){
                    return false;
                }
            }
        }
        return true;
    }
}

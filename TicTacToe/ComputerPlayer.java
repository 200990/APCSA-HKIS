import java.util.Scanner;

public class ComputerPlayer extends Player
{
    
    public ComputerPlayer()
    {
    }

    public void mark(String[][] gameBoard){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\npress a key to continue");
        scanner.nextLine();
        int row;
        int column;
        while(true){
            row = (int)(Math.random() * 4);       
            column = (int)(Math.random() * 4);
            if(gameBoard[row][column] == "_"){
                break;
            }
        }
        gameBoard[row][column] = "O";
        System.out.println("Your opponent marked row: " + (row + 1) + ", and column: " + (column + 1));
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

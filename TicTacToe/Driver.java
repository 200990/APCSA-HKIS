import java.util.Scanner;

public class Driver
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Game officialGame = new Game();
        officialGame.startGame();
        System.out.println("Would you like to play again? yes or no");
        while(true){
            String answer = scanner.nextLine();
            if(answer.equals("yes")){
                Game anotherOfficialGame = new Game();
                anotherOfficialGame.startGame();
                System.out.println("Would you like to play again? yes or no");
            }
            else if(answer.equals("no")){
                System.out.println("Thank you for playing? :)");
                break;
            }
            else{
                System.out.println("Error! Please type in either yes or no.");
            }
        }
    }
}

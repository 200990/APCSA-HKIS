import java.util.Scanner;

public class HelloWorldAgain{
    
    public static void main(){
        System.out.println("UABHBcbiljlwapo!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many noble, excellent, magnificent number of elements does thou want?");
        int num = scanner.nextInt();
        NumberSequence zeSequence = new NumberSequence(num);
        boolean complete = false;
        while(!complete){
          System.out.println("What noble, excellent, magnificent task does thou want to do?");
          System.out.println("fibonacci, square, cubic, or triangle? \nPlease be careful with capitalistaion in your answer.");
          String response = scanner.nextLine();
          if(response.equals("fibonacci")){
             zeSequence.fibonacci();
             System.out.println("Would you like to try again? yes or no.");
             String answer = scanner.nextLine();
             if(answer.equals("no")){
                complete = true; 
             }
          }
          else if(response.equals("square")){
             zeSequence.square();
             System.out.println("Would you like to try again? yes or no.");
             String answer = scanner.nextLine();
             if(answer.equals("no")){
                complete = true; 
             }
          }
          else if(response.equals("cubic")){
             zeSequence.cubic();
             System.out.println("Would you like to try again? yes or no.");
             String answer = scanner.nextLine();
             if(answer.equals("no")){
                complete = true; 
             }
          }
          else if(response.equals("triangle")){
             zeSequence.triangle();
             System.out.println("Would you like to try again? yes or no.");
             String answer = scanner.nextLine();
             if(answer.equals("no")){
                complete = true; 
             }
          } 
          else{
             System.out.println("Invalid response. \n Would you like to try again? yes or no.");
             String answer = scanner.nextLine();
             if(answer.equals("no")){
                complete = true; 
             }
          }
        }
    }
}
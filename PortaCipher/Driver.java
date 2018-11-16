import java.util.Scanner;

public class Driver
{
    public static void main(String[] args){
       while(true){
          Scanner scanner = new Scanner(System.in);
          while(true){
             System.out.println("Would you like to encrypt or decrypt?");
             String response = scanner.nextLine();
             if(response.equals("encrypt")){
                 Encryption encryption = new Encryption();
                 encryption.encrypt();
                 break;
             }
             else if(response.equals("decrypt")){
                 Decryption decryption = new Decryption();
                 decryption.decrypt();
                 break;
             }
             else{
                 System.out.println("Invalid! Please enter a valid command.");
             }
          }
          String answer;
          while(true){
             System.out.println("Would you like to try again? yes or no");
             answer = scanner.nextLine();
             if(answer.equals("no")){
                break;
             }
             else if(answer.equals("yes")){
                break;
             }
             else{
                System.out.println("Invalid! Please enter a valid command.");
             }
          }
          if(answer.equals("no")){
              break;
          }
       }
    }
}

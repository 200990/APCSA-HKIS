import java.util.Scanner;

public class Decryption{
   public void decrypt(){
     Scanner scanner = new Scanner(System.in);
     System.out.println("What is your message");
     String message = scanner.nextLine();
     System.out.println("What is your key");
     String answer = scanner.nextLine();
     int messageLength = message.length();
     int answerLength = answer.length();
     char keyArray[] = new char[messageLength];
     for(int i=0; i<messageLength; i++){ 
        keyArray[i] = answer.charAt(i%(answerLength));
     }
     String tempKey = new String(keyArray);
     char tempWord[] = new char[messageLength];
     for(int i = 0; i<messageLength; i ++){
        int valueMessage = ((int)message.charAt(i))-97;
        int valueKey = (((int)tempKey.charAt(i))-97)/2;
        if(valueMessage>=(valueKey + 13)){
           char valueAnswer = (char)((valueMessage - valueKey - 13) + 97);
           //System.out.println(valueAnswer);
           tempWord[i] = valueAnswer;
        }
        else if(valueMessage<(valueKey + 13)){
           char valueAnswer = (char)(((valueMessage - valueKey) + 13) + 97);
           tempWord[i] = valueAnswer; 
        }
     }
     String word = new String(tempWord);
     System.out.println(word); 
   }
}
